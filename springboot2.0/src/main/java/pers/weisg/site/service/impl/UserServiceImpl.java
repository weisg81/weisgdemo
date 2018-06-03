package pers.weisg.site.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import pers.weisg.site.service.UserService;

/** 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG   
 * @date 2018年6月1日   
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public void saveUser(Map<String, String> params) {
		System.out.println("===========UserServiceImpl===========");
	}

}
