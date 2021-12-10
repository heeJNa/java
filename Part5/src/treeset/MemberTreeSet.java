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
	
	public boolean removeMember(int memberId){  // ��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		
		Iterator<Member> ir =  treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();	//ir�� �������� �ű�.
			int tempId = member.getMemberId();
			if(tempId == memberId){            // ������̵� �Ű������� ��ġ�ϸ� 
				 treeSet.remove(member);           // �ش� ����� ����
				return true;                   // true ��ȯ
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");  //for �� ������ ���� return �� �ȵȰ��
		return false;
	}

	public void showAllMember() {
		for(Member member :  treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
