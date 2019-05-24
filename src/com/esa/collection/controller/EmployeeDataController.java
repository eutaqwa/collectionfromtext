package com.esa.collection.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.esa.collection.model.EmployeeTextModel;
import com.esa.collection.service.EmployeeTextService;

/**
 * Servlet implementation class EmployeeDataController
 */
@WebServlet("/EmployeeDataController")
public class EmployeeDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDataController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		File file = new File("D://ESA/employee.txt");
		List<EmployeeTextModel> employeeList = EmployeeTextService.employeeTextModel(file);
		HttpSession httpsession = request.getSession(true);
		httpsession.setAttribute("employeeSession", employeeList);
		@SuppressWarnings("unchecked")
		ArrayList<EmployeeTextModel> http = (ArrayList<EmployeeTextModel>) request.getSession(false).getAttribute("employeeSession");
		for(EmployeeTextModel model : http){
			model.getId();
			model.getName();
			model.getEntrydate();
			model.getGrade();
			model.getSalary();
		}
		request.setAttribute("employeeList", employeeList);
		RequestDispatcher rd = request.getRequestDispatcher("/EmployeeText.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
