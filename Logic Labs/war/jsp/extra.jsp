<jsp:useBean id="loginManager" scope="session" class="org.bimserver.LoginManager" />
<% if (loginManager.getService().getCurrentUser().getUsername().contains("@")) { %>
<div>
Tell a friend<br/>
<form action="tellafriend.jsp" method="post">
<label for="email">E-mail address</label> <input id="email" type="text" name="email"/>
<input type="submit" value="Send"/>
</form>
</div>
<% } %>