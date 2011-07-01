function setFocus( aForm )
{
	if( aForm.elements[0]!=null) {
		var i;
		var max = aForm.length;
		for( i = 0; i < max; i++ ) {
			if( aForm.elements[ i ].type != "hidden" &&
				!aForm.elements[ i ].disabled &&
				!aForm.elements[ i ].readOnly ) {
				aForm.elements[ i ].focus();
				break;
			}
		}
	}
}

function activateTabWithTabber(tabber, tabName) {
	tb_remove();
	for (i=0; i<tabber.tabs.length; i++) {
		if (tabber.tabs[i].headingText == tabName || tabber.tabs[i].div.id == tabName) {
			tabber.tabShow(i);
			break;
		}
	}
}

function activateTab(tabName) {
	var tabber = $(".tabberlive").attr("tabber");
	activateTabWithTabber(tabber, tabName);
}

function trim(s)
{
	var l=0; var r=s.length -1;
	while(l < s.length && s[l] == ' ')
	{	l++; }
	while(r > l && s[r] == ' ')
	{	r-=1;	}
	return s.substring(l, r+1);
}