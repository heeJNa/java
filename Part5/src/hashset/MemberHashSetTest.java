package hashset;

import java.util.HashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("김유신"));
		hashSet.add(new String("이순신"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		
		System.out.println(hashSet);


		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(100, "이순신");
		Member memberKim = new Member(1001, "김유신");
		Member memberKang = new Member(103, "강감찬");
		Member memberHong = new Member(1003, "홍길동");
		
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
		
		//memberHashSet.removeMember(memberHong.getMemberId());
		memberHashSet.showAllMember();

	}

}
