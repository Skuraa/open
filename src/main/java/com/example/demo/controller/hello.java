package com.example.demo.controller;


import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController

public class hello {


	@Resource
	UserDao userDao;

	@RequestMapping("welcome")
	public String index(){
		return null;
	}
}
