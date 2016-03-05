package com.tob.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tob.model.Emp;
import com.tob.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	private List<Emp> testEmpList;
	
	public LoginServiceImpl(){
		testEmpList = new ArrayList<Emp>();
		
		Emp emp1 = new Emp();
		emp1.setEmpNo(7001);
		emp1.setAccount("account1");
		emp1.setPassword("password1");
		Emp emp2 = new Emp();
		emp1.setEmpNo(7002);
		emp2.setAccount("account2");
		emp2.setPassword("password2");
		Emp emp3 = new Emp();
		emp1.setEmpNo(7003);
		emp3.setAccount("account3");
		emp3.setPassword("password3");
		
		testEmpList.add(emp1);
		testEmpList.add(emp2);
		testEmpList.add(emp3);
	}

	@Override
	public Emp login(String account, String password) {
		// 敏捷開發設計建議，東西不要回傳null，免得每天都在噴NullPointException
		Emp result = new Emp();
		
		for(Emp emp : testEmpList){
			if(emp.getAccount().equals(account) && emp.getPassword().equals(password)){
				result = emp;
			}
		}
		
		return result;
	}

}
