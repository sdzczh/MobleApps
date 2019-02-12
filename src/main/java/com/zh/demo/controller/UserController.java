package com.zh.demo.controller;

import com.zh.demo.entity.TMessage;
import com.zh.demo.service.TMessageService;
import com.zh.demo.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @Autowired
    private TMessageService tMessageService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public String toIndex(TMessage tMessage){
        tMessage.setCreateTime(DateUtils.getCurrentTimeStr());
        tMessageService.insert(tMessage);
        return "true";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
