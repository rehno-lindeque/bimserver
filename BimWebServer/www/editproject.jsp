<%@page import="java.util.List"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.bimserver.utils.Formatters"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Comparator"%>
<%@page import="org.bimserver.shared.UserException"%>
<%@page import="org.bimserver.web.JspHelper"%>
<%@page import="org.bimserver.interfaces.objects.SProject"%>
<%@page import="org.bimserver.interfaces.objects.SGeoTag"%>
<%@page	import="org.bimserver.interfaces.objects.SClashDetectionSettings"%>
<%@page import="org.bimserver.interfaces.objects.SUser"%>
<%@page import="org.bimserver.interfaces.objects.SSIPrefix"%>
<%@ include file="header.jsp"%>
<!-- start map scripts - many thanks to Bart vd Eijnden www.osgis.nl -->
<script type="text/javascript" src="js/adapter/ext/ext-base.js"></script>
<script type="text/javascript" src="js/ext-all.js"></script>
<link rel="stylesheet" type="text/css" href="css/ext-all.css" />
<script type="text/javascript" src="js/OpenLayers.js"></script>
<script type="text/javascript" src="js/ol_overrides.js"></script>
<script type="text/javascript" src="js/GeoExt.js"></script>
<script type="text/javascript" src="js/proj4js.js"></script>
<script type="text/javascript" src="js/map.js"></script>
<!-- end mapscripts -->
<div class="sidebar"></div>
<div class="content">
<%
	if (loginManager.getService().isLoggedIn()) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		long poid = Long.parseLong(request.getParameter("poid"));
		SProject sProject = loginManager.getService().getProjectByPoid(poid);
		SUser anonymousUser = null;
		try {
			anonymousUser = loginManager.getService().getAnonymousUser();
		} catch (UserException e) {
		}
		boolean anonymousAccess = anonymousUser != null && sProject.getHasAuthorizedUsers().contains(anonymousUser.getOid());
		try {
			SGeoTag sGeoTag = loginManager.getService().getGeoTag(sProject.getGeoTagId());
			SClashDetectionSettings sClashDetectionSettings = loginManager.getService().getClashDetectionSettings(
			sProject.getClashDetectionSettingsId());
			if (request.getParameter("save") != null) {
				try {
					if (sProject.getParentId() == -1) {
						sGeoTag.setEnabled(request.getParameter("coordcheck") != null);
						sGeoTag.setX(Float.parseFloat(request.getParameter("x")));
						sGeoTag.setY(Float.parseFloat(request.getParameter("y")));
						sGeoTag.setZ(Float.parseFloat(request.getParameter("z")));
						sGeoTag.setDirectionAngle(Float.parseFloat(request.getParameter("directionAngle")));
						sGeoTag.setEpsg(Integer.parseInt(request.getParameter("epsg").substring(5)));
						loginManager.getService().updateGeoTag(sGeoTag);
						sClashDetectionSettings.setEnabled(request.getParameter("clashdetection") != null);
						sClashDetectionSettings.setMargin(Float.parseFloat(request.getParameter("margin")));
						loginManager.getService().updateClashDetectionSettings(sClashDetectionSettings);
					}
					sProject.setName(request.getParameter("name"));
					sProject.setDescription(request.getParameter("description"));
					sProject.setExportLengthMeasurePrefix(SSIPrefix.values()[Integer.parseInt(request.getParameter("exportLengthMeasurePrefix"))]);
					loginManager.getService().updateProject(sProject);
					if (request.getParameter("anonymous") == null) {
						if (anonymousAccess) {
							loginManager.getService().removeUserFromProject(anonymousUser.getOid(), poid);
						}
					} else {
						loginManager.getService().addUserToProject(anonymousUser.getOid(), poid);
					}
					response.sendRedirect("project.jsp?poid=" + poid);
				} catch (UserException e) {
					out.println("<div class=\"error\">" + e.getMessage() + "</div>");
				}
			}
%>
<%
	if (request.getParameter("message") != null) {
				out.println("<div class=\"error\">" + request.getParameter("message") + "</div>");
			}
%>
<div id="guide">
  <div id="guidewrap">
    <ol id="breadcrumb">
	  <li><%=JspHelper.generateBreadCrumbPath(sProject, loginManager.getService())%></li>
    </ol>
  </div>
</div>
<div id="guide_wrap_btm"></div>
<h1>Project details (<%=sProject.getName()%>)</h1>
<div class="tabber" id="projecttabber">
<div class="tabbertab" id="detailstab" title="Details">
<form method="post" action="editproject.jsp" name="form">
<table class="formtable">
	<tr>
		<td class="first"><label for="name">Name</label></td>
		<td><input id="name" type="text" name="name"
			value="<%=request.getParameter("name") != null ? request.getParameter("name") : sProject.getName()%>" /></td>
	</tr>
	<tr>
		<td class="first"><label for="description">Description</label></td>
		<td><textarea id="description" name="description" cols="70" rows="5"><%=request.getParameter("description") != null ? request.getParameter("description") : sProject.getDescription()%></textarea></td>
	</tr>
<% if (anonymousUser != null) { %>
	<tr>
		<td class="first"><label for="anonymous" class="checkbox">Anonymous
		access</label></td>
		<td><input id="anonymous" name="anonymous" type="checkbox"
			class="checkbox" <%=anonymousAccess ? "checked=\"checked\"" : ""%> /></td>
	</tr>
	<%
}
		if (sProject.getParentId() == -1) {
	%>
	<tr>
		<td class="first"><label for="clashdetection" class="checkbox">Automatic
		clashdetection</label></td>
		<td><input id="clashdetection" name="clashdetection"
			class="checkbox" type="checkbox"
			<%=sClashDetectionSettings.isEnabled() ? "checked=\"checked\"" : ""%> /></td>
	</tr>
	<tr class="clashdetectionrow">
		<td class="indent first"><label for="margin">Margin</label></td>
		<td class="indent"><input id="margin" type="text" name="margin"
			value="<%=sClashDetectionSettings.getMargin()%>" /></td>
	</tr>
	<tr>
		<td><label for="coordcheck" class="checkbox">Geolocate</label></label></td>
		<td><input id="coordcheck" name="coordcheck" class="checkbox"
			type="checkbox" <%=sGeoTag.isEnabled() ? "checked=\"checked\"" : ""%> /></td>
	</tr>
	<tr class="coordcheckrow">
		<td class="indent first"><label for="x">X</label></td>
		<td class="indent"><input id="x" type="text" name="x"
			value="<%=sGeoTag.getX()%>" /></td>
	</tr>
	<tr class="coordcheckrow">
		<td class="indent first"><label for="y">Y</label></td>
		<td class="indent"><input id="y" type="text" name="y"
			value="<%=sGeoTag.getY()%>" /></td>
	</tr>
	<tr class="coordcheckrow">
		<td class="indent first"><label for="z">Z</label></td>
		<td class="indent"><input id="z" type="text" name="z"
			value="<%=sGeoTag.getZ()%>" /></td>
	</tr>
	<tr class="coordcheckrow">
		<td class="indent first"><label for="directionAngle">Direction Angle</label></td>
		<td class="indent"><input type="text" id="directionAngle" name="directionAngle"
			value="<%=sGeoTag.getDirectionAngle()%>" /></td>
	</tr>
	<tr class="coordcheckrow">
		<td class="indent first"><label id="epsg">EPSG</label></td>
		<td class="indent">
		<select name="epsg" id="epsg">
			<option value="EPSG:4326"<%=((4326 == sGeoTag.getEpsg() ? " SELECTED=\"SELECTED\"" : ""))%>>4326</option> 
			<option value="EPSG:900913"<%=((900913 == sGeoTag.getEpsg() ? " SELECTED=\"SELECTED\"" : ""))%>>900913</option> 
		</select>
		</td>
	</tr>
	<tr class="coordcheckrow">
		<td>
			Don't know the coordinates? <a href="#" onclick="BIMServer.Viewer.create({width: 650, height: 500, title: 'Map', formid: 'form'});">Use a map!</a>
		</td>
	</tr>
	<%
		}
	%>
	<tr>
		<td class="first"><label for="exportLengthMeasurePrefix">Uniform length measure unit for combined revisions</label></td>
		<td><select id="exportLengthMeasurePrefix" name="exportLengthMeasurePrefix">
			<%
				SSIPrefix pref = sProject.getExportLengthMeasurePrefix();
						for (SSIPrefix p : SSIPrefix.values()) {
			%>
			<option title="<%=p.name()%>" value="<%=p.ordinal()%>"
				<%=(p == pref ? "selected" : "")%>><%=p.toString().toLowerCase()%></option>
			<%
				}
			%>
		</select></td>
	</tr>
</table>
<input type="submit" value="Save" name="save" /> <input type="hidden"
	name="poid" value="<%=request.getParameter("poid")%>" /></form>
</div>
</div>
<script type="text/javascript">
$(document).ready(function(){
<%if (!sGeoTag.isEnabled()) {%>
	$(".coordcheckrow").hide();
<%}%>
<%if (!sClashDetectionSettings.isEnabled()) {%>
	$(".clashdetectionrow").hide();
<%}%>
	$("#coordcheck").click(function(){
		if ($("#coordcheck").attr('checked')) {
			$(".coordcheckrow").show();
		} else {
			$(".coordcheckrow").hide();
		}
	});
	$("#clashdetection").click(function(){
		if ($("#clashdetection").attr('checked')) {
			$(".clashdetectionrow").show();
		} else {
			$(".clashdetectionrow").hide();
		}
	});
});
</script> <%
 	} catch (UserException e) {
 			out.println(e.getUserMessage());
 		}
 	}
 %>
</div>
<jsp:include page="footer.jsp" />