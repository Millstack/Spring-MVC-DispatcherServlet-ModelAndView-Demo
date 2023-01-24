package com.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

@Component
public class TeacherService {
	
	@Autowired
	TeacherDao teacherDao; //service is directly dependent on dap so injecting dao
	
//	save teacher
	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);
	}
}
