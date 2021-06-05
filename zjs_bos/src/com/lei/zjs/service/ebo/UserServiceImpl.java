package com.lei.zjs.service.ebo;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lei.zjs.dao.UserDao;
import com.lei.zjs.service.ebi.UserService;
import com.lei.zjs.vo.User;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao<User> userDao;
	
}
