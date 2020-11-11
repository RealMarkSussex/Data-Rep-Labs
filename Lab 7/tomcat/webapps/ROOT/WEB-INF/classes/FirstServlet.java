import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */

/**
 * @author rvaidhiy
 *
 */
@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		 	resp.setContentType("text/xml");
		    
		    PrintWriter out = resp.getWriter();
		    
		    out.println("My First Servlet");
		 
	}
	
}
