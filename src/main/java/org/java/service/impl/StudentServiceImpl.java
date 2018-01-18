package org.java.service.impl;

import org.java.dao.StudentDao;
import org.java.pojo.Student;
import org.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Transactional(readOnly=true)
	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentDao.getStudentByid(id);
	}

}
