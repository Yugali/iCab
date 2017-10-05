package controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import mail.Ackmail;
import model.Model;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ViewServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String cont=request.getParameter("cont");
		String car=request.getParameter("list1");
		String origin=request.getParameter("list2");
		String dest=request.getParameter("list3");
		PrintWriter printWriter=response.getWriter();
		printWriter.println(name);
		String sql="insert into travels(name,emailid,contact,type,origin,dest,date)values(?,?,?,?,?,?,?)";
		if(name.equals("")||email.equals("")||cont.equals("")||car.equals("")||origin.equals("")||dest.equals(""))
		{
			request.setAttribute("msg", "All fields are mandatory");
			getServletContext().getRequestDispatcher("Book.jsp").include(request, response);
		}
		else
		{
			Model m=new Model();
			m.setFname(name);
			//m.setLname(lname);
			m.setEmailid(email);
			//m.setPassword(password);
			//m.setAdd(add);
			m.setContact(cont);
			m.setType(car);
			m.setOrigin(origin);
			m.setDest(dest);
		try {
			boolean status=Dao.insert1(m,sql);
			if(status)
			{
				request.setAttribute("name", name);
				request.setAttribute("email", email);
				request.setAttribute("cont", cont);
				request.setAttribute("type", car);
				request.setAttribute("origin", origin);
				request.setAttribute("dest", dest);
				Ackmail ackmail=new Ackmail();
				try {
					ackmail.sendMail(email, name,cont,car,origin,dest);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				getServletContext().getRequestDispatcher("/Rate.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Values are not inserted");
				getServletContext().getRequestDispatcher("Book.jsp").include(request, response);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
			
			
		}
	}

}
h