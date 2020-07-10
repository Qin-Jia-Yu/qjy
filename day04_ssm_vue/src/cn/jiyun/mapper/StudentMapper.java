package cn.jiyun.mapper;

import java.util.List;

import cn.jiyun.pojo.Student;

public interface StudentMapper {

	List<Student> findAll();

	List<Class> findClass();

	int addStudent(Student student);

	int updateStu(Student stu);

	int delStu(Integer[] ids);

}
