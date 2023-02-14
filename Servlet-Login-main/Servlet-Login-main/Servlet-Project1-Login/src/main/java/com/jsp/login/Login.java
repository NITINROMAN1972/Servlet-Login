package com.jsp.login;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		System.out.println(email);
		System.out.println(password);
		
		if (email.equals("milind@gmail.com") && password.equals("123")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.html");
			requestDispatcher.forward(req, res);
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.html");
			requestDispatcher.forward(req, res);
		}		
	}
}