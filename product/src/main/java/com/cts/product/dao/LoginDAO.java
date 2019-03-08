package com.cts.product.dao;

import com.cts.product.bean.Login;

public interface LoginDAO {
	public int getUserStatus(String id); 
	public String getUserType(String id);
	public Login authenticate(String userName, String password);
}
