package com.powernode.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.powernode.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * TODO
 *
 * @author clown
 * @version 1.0
 * @date 2021/3/31 11:32
 */
@Controller
@RequestMapping("register")
public class RegisterController {
    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    public ModelAndView register(Student student) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("student", student);
        mv.setViewName("register");
        return mv;
    }

    @RequestMapping(value = "register1.do")
    public String register1(HttpServletRequest request, Student student) {
        request.setAttribute("student", student);
        return "register";
    }

    @RequestMapping(value = "register2.do")
    public void register2(HttpServletResponse response, String name, Integer age) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        String json = mapper.writeValueAsString(student);
        System.out.println("json = " + json);

        PrintWriter writer = response.getWriter();
        writer.println(json);
        writer.write(json);
        writer.flush();
        writer.close();
        System.out.println("hello---");
    }

}
