package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.java.pojo.Grade;
@Mapper
public interface GradeDao {
	/**
	 * ����id��ѯ����
	 * @param id
	 * @return
	 */
	@Select("select * from grade where id=#{id}")
	Grade getGradeById(@Param("id") Integer id);
}
