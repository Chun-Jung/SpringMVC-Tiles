package com.tob.service;

import java.util.List;

import com.tob.model.Auth;
import com.tob.model.Emp;

public interface EmpAuthService {
	public List<Auth> getEmpAuth(Emp emp);
	public boolean checkEmpAuth(Emp emp, Auth auth);
}
