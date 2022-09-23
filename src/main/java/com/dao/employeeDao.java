package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javabeans.employee;
import com.javabeans.registration;
import com.javaconnection.JDBCConnection;

public class employeeDao 
{
	public boolean insert(registration reg)
	{
		String sql="insert into registration values(?,?,?)";
		
		try 
		{
			PreparedStatement st=JDBCConnection.getconnect().prepareStatement(sql);
			st.setInt(1, reg.getEmpId());
			st.setString(2, reg.getEmpName());
			st.setString(3, reg.getEmail());
			
			return st.executeUpdate()>0;
			
			
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}
	
	public boolean logininsert(employee emp)
	{
		String sql="insert into login values(?,?,?)";
		
		try 
		{
			PreparedStatement st=JDBCConnection.getconnect().prepareStatement(sql);
			st.setInt(1, emp.getEmpId());
			st.setString(2, emp.getEmpName());
			st.setString(3, emp.getDate_time());
			
			return st.executeUpdate()>0;
			
			
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}
	
public List<registration>  getUser()
	
	{
		List<registration> list=new ArrayList<>();
		String sql="select * from registration";
		
		try {
			PreparedStatement st=JDBCConnection.getconnect().prepareStatement(sql);
			ResultSet res=st.executeQuery();
			registration users=null;
			
			while(res.next())
			{
				int empId=res.getInt("empId");
				String empName=res.getString("empName");
				String email=res.getString("email");
				users=new registration(empId, empName, email);
				list.add(users);
				
			}
			
		} 
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}

public List<employee>  getlogindetails()

{
	List<employee> list=new ArrayList<>();
	String sql="select * from login";
	
	try {
		PreparedStatement st=JDBCConnection.getconnect().prepareStatement(sql);
		ResultSet res=st.executeQuery();
		employee user=null;
		
		while(res.next())
		{
			int empId=res.getInt("empId");
			String empName=res.getString("empName");
			String date_time=res.getString("date_time");
			user=new employee(empId, empName, date_time);
			list.add(user);
			
		}
		
	} 
	
	
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return list;
	
}

}
