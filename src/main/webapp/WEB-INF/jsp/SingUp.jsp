<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- Banner -->
<section id="banner">
	<div class="content">
		<header>
			<h1>Registration Form</h1>
			<form name="f" action="/user/login" method="post">
				<table cellpadding="3pt">
					<td>Email/Login :</td>
					<td><input type="text" name="username" size="30" /></td>
					</tr>
						<td>Password :</td>
						<td><input type="password" name="password" size="30" /></td>
					</tr>

				</table>
				<input type="submit" value="<spring:message code='resource.accept'/>" class="button special" />
				<a href="ForgotPassword.jsp" class="button special"><spring:message code='resource.forgot_password'/></a>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			</form>
		</header>
	</div>
</section>
