package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.employeeDao;
import com.javabeans.registration;
import com.javaconnection.JDBCConnection;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int empId=Integer.parseInt(request.getParameter("empId"));
		String empName=request.getParameter("empName");
		String email=request.getParameter("email");
		
		registration r1=new registration();
		r1.setEmpId(empId);
		r1.setEmpName(empName);
		r1.setEmail(email);
		
		employeeDao d1=new employeeDao();
		boolean b=d1.insert(r1);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		if(b)
		{
			out.println("Registration successful. Please login!!!");
			RequestDispatcher req=request.getRequestDispatcher("index.jsp");
			req.forward(request, response);
			
		}
		else
		{
			out.println("Invalid user details. Re-enter details!!!");
			RequestDispatcher req=request.getRequestDispatcher("register.jsp");
			req.include(request, response);
			
		}
		
	
	}

}
