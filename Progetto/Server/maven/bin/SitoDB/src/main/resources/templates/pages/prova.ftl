<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <#if flash.hasError()>
            ${flash.getError()}
        </#if>

        <form method="post" action="/login">
            <input placeholder="Username" name="username">
            <input placeholder="Password" name="password" type="password">
            <input type="submit" value="Login">
        </form>
    </body>
</html>