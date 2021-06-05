package com.lei.zjs.web.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lei.zjs.service.ebi.UserService;
import com.lei.zjs.vo.User;
import com.lei.zjs.web.action.base.BaseAction;

@Controller
@Scope("protoType")
public class UserAction extends BaseAction<User> {

	@Resource
	private UserService userService;
}
