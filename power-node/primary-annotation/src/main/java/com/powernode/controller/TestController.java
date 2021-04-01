package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO
 *
 * @author clown
 * @version 1.0
 * @date 2021/3/31 11:20
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/some.do")
    public ModelAndView doSome(){
        return new ModelAndView("some");
    }
    @RequestMapping("/other.do")
    public ModelAndView doOther(){
        return new ModelAndView("other");
    }
}
