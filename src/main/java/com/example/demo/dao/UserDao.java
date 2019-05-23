package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
	boolean addUser(User user);
	boolean delUser(User user);
	boolean updateUser(User user);
	List<User> queryUser();
}
