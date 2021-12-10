package hashset;

import java.util.HashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("�̼���"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		
		System.out.println(hashSet);


		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(100, "�̼���");
		Member memberKim = new Member(1001, "������");
		Member memberKang = new Member(103, "������");
		Member memberHong = new Member(1003, "ȫ�浿");
		
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
		
		//memberHashSet.removeMember(memberHong.getMemberId());
		memberHashSet.showAllMember();

	}

}
