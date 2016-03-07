package com.tob.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tob.model.Auth;
import com.tob.model.Emp;
import com.tob.model.EmpAuth;
import com.tob.service.EmpAuthService;

@Service("empAuthService")
public class EmpAuthServiceImpl implements EmpAuthService {
	private List<EmpAuth> empAuthList;
	private List<Auth> authResultList;
	private Auth[] totalAuth;
	
	public EmpAuthServiceImpl(){
		empAuthList = new ArrayList<>();
		authResultList = new ArrayList<>();
		
		Auth auth1 = new Auth();
		auth1.setAuthNo(1);
		auth1.setAuthName("功能管理1");
		Auth auth2 = new Auth();
		auth2.setAuthNo(2);
		auth2.setAuthName("功能管理2");
		Auth auth3 = new Auth();
		auth3.setAuthNo(3);
		auth3.setAuthName("功能管理3");
		totalAuth = new Auth[]{auth1, auth2, auth3};
		
		
		/** 7001有1、3的權限 */
		EmpAuth empAuth7001_1 = new EmpAuth();
		empAuth7001_1.setAuthNo(1);
		empAuth7001_1.setEmpNo(7001);
		EmpAuth empAuth7001_3 = new EmpAuth();
		empAuth7001_3.setAuthNo(3);
		empAuth7001_3.setEmpNo(7001);
		empAuthList.add(empAuth7001_1);
		empAuthList.add(empAuth7001_3);
		/** 7002有3的權限 */
		EmpAuth empAuth7002_1 = new EmpAuth();
		empAuth7002_1.setAuthNo(3);
		empAuth7002_1.setEmpNo(7002);
		empAuthList.add(empAuth7002_1);
		/** 7003有1、2、3的權限 */
		EmpAuth empAuth7003_1 = new EmpAuth();
		empAuth7003_1.setAuthNo(1);
		empAuth7003_1.setEmpNo(7003);
		EmpAuth empAuth7003_2 = new EmpAuth();
		empAuth7003_2.setAuthNo(2);
		empAuth7003_2.setEmpNo(7003);
		EmpAuth empAuth7003_3 = new EmpAuth();
		empAuth7003_3.setAuthNo(3);
		empAuth7003_3.setEmpNo(7003);
		empAuthList.add(empAuth7003_1);
		empAuthList.add(empAuth7003_2);
		empAuthList.add(empAuth7003_3);
	}

	@Override
	public List<Auth> getEmpAuth(Emp emp) {
		authResultList = new ArrayList<>();
		if(emp == null){
			return authResultList;
		}
		Integer empNo = emp.getEmpNo();
		
		for(EmpAuth empAuth : empAuthList){
			if(empAuth.getEmpNo().equals(empNo)){
				for(Auth auth : totalAuth){
					if(auth.getAuthNo().equals(empAuth.getAuthNo()) ){
						authResultList.add(auth);
					}
				}
			}
		}
		return authResultList;
	}

	@Override
	public boolean checkEmpAuth(Emp emp, Auth auth) {
		List<Integer> empHasAuthsNo = new ArrayList<>();
		for(EmpAuth empAuth : empAuthList){
			if(empAuth.getEmpNo().equals(emp.getEmpNo())){
				empHasAuthsNo.add(empAuth.getAuthNo());
			}
		}
		for(Integer authNo : empHasAuthsNo){
			if(authNo.equals(auth.getAuthNo())){
				return true;
			}
		}
		return false;
	}

}
