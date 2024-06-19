package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName : HelloController
 * @Description :
 * @Author : y
 * @Date: 2024-06-19 21:16
 */

@Controller
@ResponseBody
public class HelloController {
    @RequestMapping("/")
    public String welcome(){
        return "main";
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name, Model model){
        System.out.println(name);
        String msg=name+"你好呀！";
        model.addAttribute("msg",msg);
        return "hello";
    }
}
