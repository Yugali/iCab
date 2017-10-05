package controller;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import model.Model;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailid=request.getParameter("emailid");
		String password=request.getParameter("password");
		String sql="select *from register where emailid=? and password=?";
		if(emailid.equals("admin@gmail.com")||password.equals("admin"))
		{
			request.setAttribute("email1", emailid);
			getServletContext().getRequestDispatcher("/Admin.jsp").include(request,response );
		}
		if(emailid.equals("")||password.equals(""))
		{
			request.setAttribute("msg", "All Fields are mandatory");
			getServletContext().getRequestDispatcher("/Login.jsp").include(request,response );
		}
		else
		{
			Model model=new Model();
			model.setEmailid(emailid);
			model.setPassword(password);
			try {
				ResultSet rs=Dao.validate(model, sql);
				if(rs.next())
				{
					request.setAttribute("email1", emailid);
					getServletContext().getRequestDispatcher("/Profile.jsp").include(request,response );
				}
				else
				{
					request.setAttribute("msg", "Please Try Again");
					getServletContext().getRequestDispatcher("/Login.jsp").include(request,response );
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
