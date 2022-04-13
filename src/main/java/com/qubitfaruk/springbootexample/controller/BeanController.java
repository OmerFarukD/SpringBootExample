package com.qubitfaruk.springbootexample.controller;


import com.qubitfaruk.springbootexample.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class BeanController {
    @Autowired
    private BeanConfig beanConfig;


    //http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto")
    @ResponseBody
    public String getBeanDto(){
        return this.beanConfig.beanDto()+".";
    }
}
