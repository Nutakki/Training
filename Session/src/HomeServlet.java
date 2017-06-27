import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HomeServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		HttpSession session=request.getSession(true);
		RequestDispatcher dispatcher;
			if(session.getAttribute("username")!=null){
				dispatcher = request.getRequestDispatcher("/home.jsp");  
	            dispatcher.forward(request, response);		 
			}
			else {
				dispatcher = request.getRequestDispatcher("/login.jsp");  
	            dispatcher.forward(request, response);
			}
	}
}
