package com.jspcalculator.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int number1, number2;
		  String operator;
		  response.setContentType("text/html");
		     response.setCharacterEncoding("UTF-8");
		     PrintWriter out = response.getWriter();
		     number1 = Integer.parseInt(request.getParameter("number1"));
		     number2 = Integer.parseInt(request.getParameter("number2"));
		     operator = request.getParameter("operator");
		     
		     OperatingClass oc = new OperatingClass(number1, number2, operator);
		     oc.calc();
		     
		     out.write("<html>");
		     out.write("<head><title>calculator</title></head>");
		     out.write("<body>");
		     if(operator.equals("/"))
		      out.write(number1 +" "+ operator +" "+ number2 + " = " + oc.getResult2());
		     else
		      out.write(number1 +" "+ operator +" "+ number2 + " = " + oc.getResult1());
		     out.write("</body></html>");
		     
		     
	}

}
