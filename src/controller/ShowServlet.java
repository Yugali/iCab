package controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import model.Model;

@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ShowServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String sql="select * from travels where emailid=?";
		PrintWriter printWriter=response.getWriter();
		String name=null;
		String cont=null;
		String type=null;
		String origin=null;
		String dest=null;
		String date=null;
		
		Model model=new Model();
		model.setEmailid(email);
		try {
			ResultSet rs=Dao.validate1(model, sql);
			printWriter.println("<html><body><table border='1'><tr><th>Type</th><th>Source</th><th>Destination</th><th>Date</th></tr>");
			
			while(rs.next())
			{
				type=rs.getString(4);
				origin=rs.getString(5);
				dest=rs.getString(6);
				date=rs.getString(7);
				
				printWriter.println("<tr><td>"+type+"</td>");
				printWriter.println("<td>"+origin+"</td>");
				printWriter.println("<td>"+dest+"</td>");
				printWriter.println("<td>"+date+"</td></tr>");
				
				
				
				
			}	
			printWriter.println("</tr></table></body></html>");
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


