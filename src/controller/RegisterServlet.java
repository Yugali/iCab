package controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import model.Model;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String emailid=request.getParameter("emailid");
		String password=request.getParameter("password");
		String password1=request.getParameter("password1");
		String add=request.getParameter("add");
		String con=request.getParameter("contact");
		String dob=request.getParameter("dob");
		String sql="insert into register(fname,lname,emailid,password,address,contact,dob)values(?,?,?,?,?,?,?)";
		if(fname.equals("")||lname.equals("")||emailid.equals("")||password.equals("")||password1.equals("")||add.equals("")||con.equals("")||dob.equals(""))
		{
			request.setAttribute("msg", "All fields are mandatory");
			getServletContext().getRequestDispatcher("Register.jsp").include(request, response);
		}
		else if(password.equals(password1))
		{
			Model m=new Model();
			m.setFname(fname);
			m.setLname(lname);
			m.setEmailid(emailid);
			m.setPassword(password);
			m.setAdd(add);
			m.setContact(con);
			m.setDob(dob);
		try {
			boolean status=Dao.insert(m,sql);
			if(status)
			{
				getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Values are not inserted");
				getServletContext().getRequestDispatcher("Register.jsp").include(request, response);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
