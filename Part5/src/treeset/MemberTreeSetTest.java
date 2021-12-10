package treeset;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<>();	//String�� comparable�� ������ ���Ƽ� ������ ��.
		
		set.add("ȫ�浿");
		set.add("������");
		set.add("�̼���");
		
		System.out.println(set);
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1002, "�̼���");
		Member memberKim = new Member(1001, "������");
		Member memberKang = new Member(1004, "������");
		Member memberHong = new Member(1003, "ȫ�浿");
		
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);
		
		memberTreeSet.showAllMember();
		
		//memberHashSet.removeMember(memberHong.getMemberId());
		//memberTreeSet.showAllMember();
	 	
	}

}
