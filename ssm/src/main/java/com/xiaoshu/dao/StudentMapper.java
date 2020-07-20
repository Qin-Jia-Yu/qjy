package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Clazz;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper extends BaseMapper<Student> {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    List<Student> selectByExample(StudentExample example);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

	List<Clazz> findClazz();

	List<Student> findAll(Student student);

	List<Student> findStudentByName(String sname);

	Integer findClazzId(String cname);

}