package edu.dgut.controller;

import edu.dgut.domain.Account;
import edu.dgut.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;


//    @PostMapping("/list")
//    @ResponseBody
//    public List<Account> findAllAccount(){
//        return accountService.findAll();
//    }
    @GetMapping("/list")
    public ModelAndView jsp(){
        List<Account> list = accountService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("hello");
        return mv;
    }


}
