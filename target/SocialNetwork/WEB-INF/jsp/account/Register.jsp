<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- Banner -->
<section id="banner">
    <div class="content">
        <header>
            <h4><spring:message code='resource.registration_title'/></h4>
            <c:if test="${not empty error}">
                <div class="error"><h3>${error}</h3></div>
            </c:if>
            <form action="register" method="post" modelAttribute="user" enctype="multipart/form-data">
                <table cellpadding="3pt">
                    <tr>
                        <td><spring:message code='resource.first_name_title'/> :</td>
                        <td><input type="text" name="first_name" size="30" required/></td>
                    </tr>
                    <tr>
                        <td><spring:message code='resource.last_name_title'/> :</td>
                        <td><input type="text" name="last_name" size="30" required/></td>
                    </tr>
                    <tr>
                        <td><spring:message code='resource.email_title'/> :</td>
                        <td><input type="email" name="email" size="30"  required/></td>
                    </tr>
                    <tr>
                        <td><spring:message code='resource.phone_title'/> :</td>
                        <td><input type="text" name="phone_number" size="30"  required/></td>
                    </tr>
                    <tr>
                        <td><spring:message code='resource.password_title'/> :</td>
                        <td><input type="password" name="password" size="30"  required/></td>
                    </tr>
                    <tr>
                        <td><spring:message code='resource.confirm_password_title'/> :</td>
                        <td><input type="password" name="confirmPassword" size="30" required/></td>
                    </tr>
                    <tr>
                        <td><spring:message code='resource.photo_title'/> :</td>
                        <td><input type="file" name="file" required ></td>
                    </tr>
                </table>
                <p/>
                <input type="submit" value="<spring:message code='resource.accept'/>"/>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </header>
    </div>
</section>

