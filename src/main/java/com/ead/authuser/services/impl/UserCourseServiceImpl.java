package com.ead.authuser.services.impl;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.authuser.models.UserCourseModel;
import com.ead.authuser.models.UserModel;
import com.ead.authuser.repositories.UserCourseRepository;
import com.ead.authuser.services.UserCourseService;

@Service
public class UserCourseServiceImpl implements UserCourseService{
 
	@Autowired
	UserCourseRepository userCourseRepository;

	@Override
	public boolean existsByUserAndCourseId(UserModel userModel, UUID courseId) {
		return userCourseRepository.existsByUserAndCourseId(userModel, courseId); 
	}

	@Override
	public UserCourseModel save(UserCourseModel userCouseModel) {
		return userCourseRepository.save(userCouseModel);
	}

	@Override
	public boolean existsByCourseId(UUID courseId) {
		return userCourseRepository.existsByCourseId(courseId);
	}
    
	@Transactional
	@Override
	public void deleteUserCourseByCourse(UUID courseId) {
		userCourseRepository.deleteAllByCourseId(courseId);
		
	} 
}
