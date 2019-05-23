package com.example.demo.dao;

import com.example.demo.entity.Recruitment;

import java.util.List;

public interface RecruitmentDao {
	boolean addRecruitment(Recruitment recruitment);
	boolean delRecruitment(Recruitment recruitment);
	boolean updateRecruitment(Recruitment recruitment);
	List<Recruitment> queryRecruitment();
}
