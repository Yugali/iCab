package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mysql.jdbc.Connection;

import model.Model;

public class Dao {

	static Connection con=null;
	static
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/icab","root","root");
		}catch(ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

public static boolean insert(Model m, String sql) throws SQLException {
	boolean status=false;
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, m.getFname());
	ps.setString(2, m.getLname());
	ps.setString(3, m.getEmailid());
	ps.setString(4, m.getPassword());
	ps.setString(5, m.getAdd());
	ps.setString(6 ,m.getContact());
	ps.setString(7, m.getDob());
	
	int i=ps.executeUpdate();
	// i return two values 0-- not inserted or 1-- inserted
	
	if(i!=0)
	{
		status=true;
	}
	else
	{
		status=false;
	}
	
	return status;
}

public static boolean insert1(Model m, String sql) throws SQLException {
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	boolean status=false;
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, m.getFname());
	ps.setString(2, m.getEmailid());
	ps.setString(3 ,m.getContact());
	ps.setString(4, m.getType());
	ps.setString(5, m.getOrigin());
	ps.setString(6, m.getDest());
	ps.setString(7, dateFormat.format(date));
	
	int i=ps.executeUpdate();
	// i return two values 0-- not inserted or 1-- inserted
	
	if(i!=0)
	{
		status=true;
	}
	else
	{
		status=false;
	}
	
	return status;
}

public static ResultSet validate(Model m, String sql) throws SQLException {
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, m.getEmailid());
	ps.setString(2, m.getPassword());
	ResultSet rs=ps.executeQuery();
	return rs;
}

public static ResultSet validate1(Model m, String sql) throws SQLException {
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, m.getEmailid());
	
	ResultSet rs=ps.executeQuery();
	return rs;
}


	
}
