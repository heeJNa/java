package treeset;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<>();	//String이 comparable을 구현해 놓아서 정렬이 됨.
		
		set.add("홍길동");
		set.add("강감찬");
		set.add("이순신");
		
		System.out.println(set);
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1002, "이순신");
		Member memberKim = new Member(1001, "김유신");
		Member memberKang = new Member(1004, "강감찬");
		Member memberHong = new Member(1003, "홍길동");
		
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);
		
		memberTreeSet.showAllMember();
		
		//memberHashSet.removeMember(memberHong.getMemberId());
		//memberTreeSet.showAllMember();
	 	
	}

}
