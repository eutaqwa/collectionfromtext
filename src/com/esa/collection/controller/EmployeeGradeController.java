package com.esa.collection.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.esa.collection.model.EmployeeTextModel;


/**
 * Servlet implementation class EmployeeGradeController
 */
@WebServlet("/EmployeeGradeController")
public class EmployeeGradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeGradeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idemployee = request.getParameter("id");
		EmployeeTextModel models = new EmployeeTextModel();
		List<EmployeeTextModel> listgrade = new ArrayList<EmployeeTextModel>();
		@SuppressWarnings("unchecked")
		ArrayList<EmployeeTextModel> grade = (ArrayList<EmployeeTextModel>) request.getSession(false).getAttribute("employeeSession");
		for(EmployeeTextModel session : grade){
			if(session.getId().equals(idemployee)){
				models.setGrade(session.getGrade());
				models.setSalary(session.getSalary());
				listgrade.add(models);
			}
		}
		request.setAttribute("listgrade", listgrade);
		RequestDispatcher rd = request.getRequestDispatcher("/GradeText.jsp");
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
