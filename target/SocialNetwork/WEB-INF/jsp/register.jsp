<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Banner -->
<section id="banner">
    <div class="content">
        <header>
            <h1>Registration Form</h1>
            <form action="register" method="post" modelAttribute="user" enctype="multipart/form-data">
                <table cellpadding="3pt">
                    <tr>
                        <td>First Name :</td>
                        <td><input type="text" name="first_name" size="30"/></td>
                    </tr>
                    <tr>
                        <td>Last Name :</td>
                        <td><input type="text" name="last_name" size="30"/></td>
                    </tr>
                    <tr>
                        <td>Email :</td>
                        <td><input type="text" name="email" size="30"/></td>
                    </tr>
                    <tr>
                        <td>Phone :</td>
                        <td><input type="text" name="phone_number" size="30"/></td>
                    </tr>
                    <tr>
                        <td>Password :</td>
                        <td><input type="password" name="password" size="30"/></td>
                    </tr>
                    <tr>
                        <td>Photo :</td>
                        <td><input type="file" name="file"></td>
                    </tr>
                </table>
                <p/>
                <input type="submit" value="Accept"/>
            </form>
        </header>
    </div>
</section>

