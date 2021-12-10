package treeset;


import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		 treeSet = new TreeSet<>();
	}
	
	public void addMember(Member member) {
		 treeSet.add(member);
	}
	
	public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환
		
		Iterator<Member> ir =  treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();	//ir을 다음으로 옮김.
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				 treeSet.remove(member);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
		return false;
	}

	public void showAllMember() {
		for(Member member :  treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
