<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- Banner -->
<section id="banner">
	<div class="content">
		<header>

            <c:if test="${not empty error}">
                <div class="error"><h4>${error}</h4></div>
            </c:if>
			<form name="f" action="/account/login" method="post">
				<table cellpadding="3pt">
					<td><spring:message code='resource.email_title'/> :</td>
					<td><input type="text" name="username" size="30" /></td>
					</tr>
						<td><spring:message code='resource.password_title'/> :</td>
						<td><input type="password" name="password" size="30" /></td>
					</tr>
				</table>
				<input type="submit" value="<spring:message code='resource.accept'/>" class="button special" />
				<a href="/account/forgotPassword" class="button special"><spring:message code='resource.forgot_password'/></a>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			</form>
		</header>
	</div>
</section>
