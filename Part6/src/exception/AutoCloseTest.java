package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseableObj obj = new AutoCloseableObj(); 
		//autocloseable�� implement�� ��ü�� �ڵ����� close()��.
			
		try(obj){
			throw new Exception(); //������ exception �߻� 
		}catch(Exception e) {
			System.out.println("exception");
		}
		
		System.out.println("end");
	}

}
