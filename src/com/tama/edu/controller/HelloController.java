package com.tama.edu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// getting the inputs from input.jsp
		String name = request.getParameter("name");
		
		// putting the request inside a map object for further use 
		Map<String, String> map = new HashMap<String, String>(); 
			map.put("msg", "Helllo.... : " + name);

		// returning ModelAndView Object(map) and success page to Dispatcher Servlet
		return new ModelAndView("success", map);
	}

}
