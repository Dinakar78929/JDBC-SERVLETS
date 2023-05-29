package com.xworkz.details.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.details.dto.DetailsDTO;
import com.xworkz.details.repo.DetailsRepository;
import com.xworkz.details.service.DetailsService;
import com.xworkz.details.service.DetailsServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = ("/send"))
public class DetailsServlet extends HttpServlet {
	
	private DetailsService detailsService=new DetailsServiceImpl();

	public DetailsServlet() {
		System.out.println("No args DetailsServlet const");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do post method");
//		String name=req.getParameter("name");

		DetailsDTO detailsDTO = new DetailsDTO();
		detailsDTO.setName(req.getParameter("name"));
//		System.out.println(detailsDTO.getName());
		detailsDTO.setQualification(req.getParameter("qualification"));
		detailsDTO.setStream(req.getParameter("stream"));
		detailsDTO.setCourse(req.getParameter("course"));
		detailsDTO.setCollege(req.getParameter("college"));
		detailsDTO.setCity(req.getParameter("city"));
		detailsDTO.setState(req.getParameter("state"));
		detailsDTO.setCountry(req.getParameter("country"));

		System.out.println(detailsDTO.toString());
		try {
		boolean save1=this.detailsService.validateAndSave(detailsDTO);
		System.out.println("DTO is validateAndSave:"+save1);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Display.jsp");
		dispatcher.forward(req, resp);
	}

}
