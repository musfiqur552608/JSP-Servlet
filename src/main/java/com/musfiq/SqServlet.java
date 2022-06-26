package com.musfiq;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
//		int k = Integer.parseInt(req.getParameter("k"));
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
	}

}
