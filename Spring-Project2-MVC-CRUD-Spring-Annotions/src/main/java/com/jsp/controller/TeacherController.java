package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	TeacherService teacherService;
	
	@RequestMapping("/save")
	public ModelAndView load() {
		System.out.println("Reaching");
		ModelAndView modelAndView = new ModelAndView("createteacher.jsp");
		modelAndView.addObject("teacher1", new Teacher());
		return modelAndView;
	}
	
	@RequestMapping("/saveteacher")
	public ModelAndView saveTeacher(@ModelAttribute Teacher teacher) {
		teacherService.saveTeacher(teacher);
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		modelAndView.addObject("saved", teacher.getName()+" has been saved");
		return modelAndView;
	}
}