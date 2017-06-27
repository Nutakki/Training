
<html>
  <body>
  <form action='loginsuccess' method='post'>
    <h1 style="color:red"> Welcome to Web programming </h1>
    <h1 style="color:red"> Welcome to Web programming </h1>
    <%=new java.util.Date()    
    %>
    <h3> Login </h3>
	<table>
	  <tr>
		<td>
		  <p style="font-family:wedding;font-size:20;font-style:italic">User Name </p>
		</td>

		<td>
		  <input type="text" id="username" name="uname">
		</td>
	  </tr>
		  <tr>
		<td>
		  Password
		</td>

		<td>
		  <input type="password" id="password" name="pwd">
		</td>
	  </tr>
	   <tr>
		<td>
		<input type="submit" value="Sign">
		</td>
	   </tr>
	</table>
</form>		
  </body>

</html>