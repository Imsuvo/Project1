package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.employeeDao;
import com.javabeans.employee;
import com.javabeans.registration;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		
		int empId=Integer.parseInt(request.getParameter("empId"));
		String empName=request.getParameter("empName");
		String date_time=dtf.format(now);
		
		employee e1=new employee();
		e1.setEmpId(empId);
		e1.setEmpName(empName);
		e1.setDate_time(date_time);
		
		employeeDao d2=new employeeDao();
		PrintWriter out=response.getWriter();
		List<registration> user=new ArrayList<>();
		user=d2.getUser();
		for(registration u:user)
		{
			if(u.getEmpId()==empId ) //&& u.getEmpName()==empName
			{
				d2.logininsert(e1);
				RequestDispatcher req=request.getRequestDispatcher("login.jsp");
				req.forward(request, response);
				
			}

			
		}
		
		RequestDispatcher req=request.getRequestDispatcher("register.jsp");
		req.forward(request, response);
		
		
	}

}
