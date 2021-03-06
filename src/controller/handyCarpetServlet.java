package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.HandyCarpet;

/**
 * Servlet implementation class handyCarpetServlet
 */
@WebServlet("/handyCarpetServlet")
public class handyCarpetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public handyCarpetServlet() {
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
		
	
		String roomLength = request.getParameter("roomLength");
		String roomWidth = request.getParameter("roomWidth");
		
		HandyCarpet handy = new HandyCarpet();
		
		try {
		handy.setLength(Integer.parseInt(roomLength));
		}
		catch (NumberFormatException ex) {
			PrintWriter writer = response.getWriter();
			writer.println("Incorrect room length. Please try again.</br>");
		}
		
		try {
		handy.setWidth(Integer.parseInt(roomWidth));
		}
		catch (NumberFormatException ex) {
			PrintWriter writer = response.getWriter();
			writer.println("Incorrect room width. Please try again.</br>");
		}
		
		handy.setArea(handy.getLength(), handy.getWidth());
		handy.setSquareYards(handy.getArea());
		
		
		PrintWriter writer = response.getWriter();
		writer.println(handy.toString());
		writer.println("</br><a href='Index.html'>Home</a>");
		writer.println("</br><a href='FloorCoverTool.jsp'>New Floor Measurement</a>");
		writer.println("</br><a href='PaintTool.jsp'>New Wall Measurement</a>");
		
		writer.close();
		
		
		
		doGet(request, response);
	}

}
