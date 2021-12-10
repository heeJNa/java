package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB user ID = " +userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB user ID = " +userInfo.getUserId());		
	}

	@Override
	public void deleteUserInf(UserInfo userInfo) {
		System.out.println("Delete into MySQL DB user ID = " +userInfo.getUserId());		
	}

}
