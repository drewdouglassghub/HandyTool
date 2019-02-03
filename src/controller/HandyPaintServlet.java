package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.HandyPaint;

/**
 * Servlet implementation class HandyPaintServlet
 */
@WebServlet("/HandyPaintServlet")
public class HandyPaintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandyPaintServlet() {
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
		
		String wallHeight = request.getParameter("wallHeight");
		String wallWidth = request.getParameter("wallWidth");
		
		
		HandyPaint handyPaint = new HandyPaint();
		
		try {
		handyPaint.setHeight(Double.parseDouble(wallHeight));	
		}
		catch (NumberFormatException ex) {
			PrintWriter writer = response.getWriter();
			writer.println("Incorrect wall height. Please try again.</br>");
			
		}
			
		try {
		handyPaint.setWidth(Double.parseDouble(wallWidth));
		}
		catch (NumberFormatException ex) {
			PrintWriter writer = response.getWriter();
			writer.println("Incorrect wall width. Please try again.</br>");		
			
		}
		
		handyPaint.setArea(handyPaint.getHeight(), handyPaint.getWidth());
		handyPaint.setGallonsOfPaint(handyPaint.getArea());
		
		
		PrintWriter writer = response.getWriter();
		writer.println(handyPaint.toString());
		writer.println("</br><a href='Index.html'>Home</a>");
		writer.println("</br><a href='FloorCoverTool.jsp'>New Floor Measurement</a>");
		writer.println("</br><a href='PaintTool.jsp'>New Wall Measurement</a>");
		
		
		writer.close();
		
		doGet(request, response);
	}

}
