package com.huihuang.controller;

import com.huihuang.entity.Student;
import com.huihuang.service.ServiceStudentImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/Student")
public class ConStudent {
    @Resource
    private ServiceStudentImpl serviceStudent;

    @RequestMapping("/addStudent.do")
    @ResponseBody
    public List<Student> selectStudent(){

        return  serviceStudent.selStudent();
    }

}
