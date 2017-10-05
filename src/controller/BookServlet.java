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

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public BookServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String sql="select * from register where emailid=?";
		
		Model model=new Model();
		model.setEmailid(email);
		try {
			ResultSet rs=Dao.validate1(model, sql);
			rs.next();
				String name=rs.getString(1);
				String cont=rs.getString(6);
				request.setAttribute("email", email);
				request.setAttribute("cont", cont);
				request.setAttribute("name", name);
				getServletContext().getRequestDispatcher("/Book.jsp").include(request,response );
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
	
