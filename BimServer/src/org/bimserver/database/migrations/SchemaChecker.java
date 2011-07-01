package org.bimserver.database.migrations;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.metamodel.UnmatchElement;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SchemaChecker {
	private static final Logger LOGGER = LoggerFactory.getLogger(SchemaChecker.class);
	private final Schema schema1;
	private final Schema schema2;

	public SchemaChecker(Schema schema1, Schema schema2) {
		this.schema1 = schema1;
		this.schema2 = schema2;
	}

	public boolean compare() {
		Resource left = new ResourceImpl();
		left.getContents().addAll(schema1.getEPackages());
		Resource right = new ResourceImpl();
		right.getContents().addAll(schema2.getEPackages());
		try {
			MatchModel resourceMatch = MatchService.doResourceMatch(left, right, new HashMap<String, Object>());
			EList<UnmatchElement> unmatchedElements = resourceMatch.getUnmatchedElements();
			if (!unmatchedElements.isEmpty()) {
				for (UnmatchElement unmatchElement : unmatchedElements) {
					LOGGER.error("Unmatch in: " + unmatchElement.getElement());
				}
				return false;
			} else {
				return true;
			}
		} catch (InterruptedException e) {
			LOGGER.error("", e);
		}
		return false;
	}
}