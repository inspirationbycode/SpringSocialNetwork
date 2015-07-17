<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Banner -->
<section id="banner">
	<div class="content">
		<header>
			<h1>Registration Form</h1>
			<form action="SingUp" method="post">
				<table cellpadding="3pt">
					<td>Email/Login :</td>
					<td><input type="text" name="email" size="30" /></td>
					</tr>
						<td>Password :</td>
						<td><input type="password" name="password" size="30" /></td>
					</tr>

				</table>
				<input type="submit" value="Accept" class="button special" />
				<a href="ForgotPassword.jsp" class="button special">Forgot your password</a>

			</form>
		</header>
	</div>
</section>
