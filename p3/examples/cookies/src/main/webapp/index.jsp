<html>
  <head>
    <title>Cookie Example</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <body>
    <h2>Cookie Example!</h2>
    <div>
      <form action="./cookies/CookieServlet" method="get">
        <select name="color">
          <option value="red">red</option>
          <option value="green">green</option>
          <option value="blue">blue</option>
      </form>
    </div>
    <br>
    <h3>Login</h3>
    <div>
      <form action="./sessions/SessionServlet" method="get">
        <input type="text" name="username" placeholder="Username" />
        <input type="submit" value="Validate" />
      </form>
    </div>
  </body>
</html>
