package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理类
 *
 * @author clown
 * @version 1.0
 * @date 2021/3/31 10:25
 */
@Controller
public class MyController {
    /**
     * @return
     * @RequestMapping: 请求映射, 把指定的请求交给方法处理
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome() {
        System.out.println("处理some.do请求");
        ModelAndView mv = new ModelAndView("some");
        mv.addObject("msg", "使用注解的spring mvc应用");
        mv.addObject("fun", "doSome");
        mv.setViewName("show");
        return mv;
    }
}
