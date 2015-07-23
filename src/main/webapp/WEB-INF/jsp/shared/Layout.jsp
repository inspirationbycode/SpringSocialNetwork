<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Main Page</title>
  <sec:csrfMetaTags/>
</head>
<body class="landing">
<div id="page-wrapper">

  <!-- Header -->
  <header id="header">
    <h1>
      <a href="/general/AboutSite"><spring:message code="resource.about_site"/></a>
    </h1>
    <nav id="nav">
      <ul>
        <li><a href="/" class="button special"><spring:message code="resource.main_page"/></a></li>
        <li><a href="/general/Rules"><spring:message code="resource.rules"/></a></li>
        <li>
          <a href="?lang=en">En</a>
          <a href="?lang=ru">Rus</a>
        </li>

        <sec:authorize access="!isAuthenticated()">
          <li><a href="/account/login" class="button special"><spring:message code="resource.sing_up"/></a></li>
          <li><a href="/account/register" class="button special"><spring:message code="resource.registration"/></a></li>
        </sec:authorize>

        <sec:authorize access="isAuthenticated()">
            <li>
              <form action="/logout" method="post">
                  <input type="submit" value="<spring:message code='resource.log_out'/>" class="button special" />
                  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
              </form>
          </li>
        </sec:authorize>


      </ul>
    </nav>
  </header>


  <!-- Page Content -->
  <div>
    <decorator:body/>
  </div>



  <!-- Footer -->
  <footer id="footer"> 2015.All rights reserved.
    </ul>
  </footer>

</div>

  <!-- Scripts -->
  <script src="/js/jquery.min.js"></script>
  <script src="/js/jquery.scrolly.min.js"></script>
  <script src="/js/jquery.dropotron.min.js"></script>
  <script src="/js/jquery.scrollex.min.js"></script>
  <script src="/js/skel.min.js"></script>
  <script src="/js/util.js"></script>
  <!--[if lte IE 8]>
  <script src="/js/ie/respond.min.js"></script><![endif]-->
  <script src="/js/main.js"></script>

</body>
</head>
  <link rel="stylesheet" href="/css/font-awesome.min.css"/>
  <link rel="stylesheet" href="/css/ie8.css"/>
  <link rel="stylesheet" href="/css/ie9.css"/>
  <link rel="stylesheet" href="/css/main.css"/>
</body>
</html>
