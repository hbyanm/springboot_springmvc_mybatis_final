package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.java.pojo.Grade;
import org.java.pojo.Student;
@Mapper
public interface StudentDao {
	@Select("select * from student where id=#{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="age",property="age"),
		@Result(column="gradeid",property="grade",javaType=Grade.class,one=@One(
				select="org.java.dao.GradeDao.getGradeById",fetchType=FetchType.EAGER))
	})
	Student getStudentByid(@Param("id") Integer id);
}
