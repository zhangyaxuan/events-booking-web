package com.yxzhang.app.service;

import java.util.List;

import com.yxzhang.app.model.MUser;

public interface MUserServiceI {

	List<MUser> getAll();
	
	MUser selectByPrimaryKey(String id);
	
    int insert(MUser muser);
    
    int update(MUser muser);
    
    int delete(String id);
}
