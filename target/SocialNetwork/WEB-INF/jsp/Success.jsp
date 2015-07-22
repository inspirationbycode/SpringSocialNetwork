<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
		<!-- Banner -->
		<section id="banner">
		<div class="content">
			<header>

			<center><p>
				You've been successfully registered.<br />
			</p></center>
			<center><p>Please click on link in your activation message in Email to
				get full registration.</p></center>
				<center>
					<spring:url value="/page/{pageName}" var="index_url" htmlEscape="true">
						<spring:param name="pageName" value="Index"/>
					</spring:url>
                    <a href="/page/Index" class="button special">Main page</a>
                </center>
                </header>
            </div>
            </section>
