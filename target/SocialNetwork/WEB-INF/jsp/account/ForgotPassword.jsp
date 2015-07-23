<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<section id="banner">
    <div class="content">
        <header>
            <p>
                <spring:message code='resource.forget_password_text'/><br />
            </p>
        </header>
        <article>
            <form name="f" action="/user/forgotPassword" method="post">
                <table cellpadding="3pt">
                    <tr>
                        <td class="vcenter"><spring:message code='resource.email_title'/> :</td>
                        <td><input type="text" name="username" size="30" /></td>
                    </tr>
                </table>
                <input type="submit" value="<spring:message code='resource.send_new_password'/>" class="button special" />
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </article>
    </div>
</section>