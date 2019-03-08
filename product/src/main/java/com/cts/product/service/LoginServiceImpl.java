package com.cts.product.service;

import com.cts.product.bean.Login;
import com.cts.product.dao.LoginDAO;
import com.cts.product.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {

	LoginDAO dao = new LoginDAOImpl();
	
	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		return dao.getUserStatus(id);
	}

	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return dao.getUserType(id);
	}

	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(userName, password);
	}

}
