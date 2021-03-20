package com.huihuang.service;

import com.huihuang.dao.StudentDao;
import com.huihuang.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ServiceStudentImpl implements ServiceStudent {
    @Resource
    private StudentDao studentdao;

    @Override
    public List<Student> selStudent() {

        return studentdao.selectStudent();
    }

    @Override
    public int insStudent(Student stu) {
        return studentdao.insertStudent(stu);
    }
}
