<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Banner -->
<section id="banner">
    <div class="content">
        <header>

            <center>
                <p>
                    <spring:message code='resource.success_register_title'/><br/>
                </p>
            </center>
            <center>
                <p><spring:message code='resource.success_register_text'/></p>
            </center>
            <center>
                <spring:url value="/page/{pageName}" var="index_url" htmlEscape="true">
                    <spring:param name="pageName" value="Index"/>
                </spring:url>
                <a href="/" class="button special">Main page</a>
            </center>
        </header>
    </div>
</section>
