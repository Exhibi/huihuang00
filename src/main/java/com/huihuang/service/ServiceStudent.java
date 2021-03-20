package com.huihuang.service;

import com.huihuang.dao.StudentDao;
import com.huihuang.entity.Student;

import java.util.List;

public interface ServiceStudent {
    List<Student> selStudent();
    int insStudent(Student stu);
}
