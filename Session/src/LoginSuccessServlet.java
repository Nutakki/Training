import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginSuccessServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
			String uname=request.getParameter("uname");
			String pw=request.getParameter("pwd");
			RequestDispatcher dispatcher;
			if(uname.equals("aa") && pw.equals("bb")) {
				HttpSession session=request.getSession(true);
				session.setAttribute("username",uname);
				session.setAttribute("password",pw);
				request.setAttribute("message","Login Sucess");
				dispatcher = request.getRequestDispatcher("/loginsuccess.jsp");  
	            dispatcher.forward(request, response);		 
			}
			else{
				request.setAttribute("message","Login Denied");
				dispatcher = request.getRequestDispatcher("/loginerror.jsp");  
	            dispatcher.forward(request, response);
			}
			
			
	}
}
