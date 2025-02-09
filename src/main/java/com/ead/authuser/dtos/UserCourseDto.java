package com.ead.authuser.dtos;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserCourseDto {
 
	UUID userId; 
	
	@NotNull
	UUID courseId; 
}
