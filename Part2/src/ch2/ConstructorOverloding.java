package ch2;

class UserInfo {

	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo(){}		//Overloding
	
	public UserInfo(String userId, String userPassWord, String userName) {	//Overloding
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "������ ���̵�� " + userId + "�̰�, ��ϵ� �̸��� " + userName + "�Դϴ�."; 
	}
}


public class ConstructorOverloding {

	public static void main(String[] args) {

		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassWord = "zxcvbn12345";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01034556699";
		userLee.userAddress = "Seoul, Korea";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "Kim");
		System.out.println(userKim.showUserInfo());

	}

}
