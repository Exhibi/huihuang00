package com.huihuang.dao;

import com.huihuang.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudent();
    int insertStudent(Student stu);
}
