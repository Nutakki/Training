
<html>
  <body>
  <%=request.getAttribute("message") %>
  <br/>
  Supplied Username is
  <b>  
  <%=request.getParameter("uname") %>
  </b>
  <br/>
  Supplier Password is 
  <b>
  <%=request.getParameter("pwd") %>
  </b>
  </body>

</html>