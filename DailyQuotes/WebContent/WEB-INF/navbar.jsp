<c:if test="${ not empty error }">
	<h3 style="color:red;">Error:  ${error }</h3>
</c:if>
<c:choose>
	<c:when test="${sessionScope.isLoggedIn != true}">
		<nav class="navbar navbar-default" role="navigation">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">Daily Quotes</a>
		    </div>
			<!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav navbar-right">
		        <li class="active">
		        	<a id="loginNavBtn" href="/loginServlet">Login</a>
		        </li>
		      </ul>
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
	</c:when>
    <c:otherwise>
        <nav class="navbar navbar-default" role="navigation">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="#">Daily Quotes</a>
		    </div>

		    <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav">
		        <li class="active">
		        	<a id="quotesNavBtn" href="/">Quotes</a>
		        </li>
		        <li>
		        	<a id="usersNavBtn" href="/usersServlet">Users</a>
		        </li>
		      </ul>
		      <ul class="nav navbar-nav navbar-right">
		        <li>
		        	<a id="logoutNavBtn" href="/logoutServlet">Logout</a>
		        </li>
		      </ul>
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
    </c:otherwise>
</c:choose>
</nav>