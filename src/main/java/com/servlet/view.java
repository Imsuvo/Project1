package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dao.employeeDao;

import com.javabeans.employee;

/**
 * Servlet implementation class view
 */
@WebServlet("/view")
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public view() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		employeeDao d3=new employeeDao();
        

		PrintWriter p=response.getWriter();
		List<employee> users=new ArrayList<>();
		
		users.addAll(d3.getlogindetails());
		
		p.println("<table callspacing='0' width='35px' border='1px'>");
		p.println("<tr>");
		p.println("<th>Employee Id</th>");
		p.println("<th>Employee Name</th>");
		p.println("<th>Data And Time</th>");
		p.println("</tr>");
		
		for(employee u:users)
		{
			p.println("<tr>");
			p.println("<td>"+u.getEmpId()+"</td>");
			p.println("<td>"+u.getEmpName()+"</td>");
			p.println("<td>"+u.getDate_time()+"</td>");
			p.println("</tr>");
		}
		p.println("</table>");
		
	}
	}


