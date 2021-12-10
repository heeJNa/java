package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseableObj obj = new AutoCloseableObj(); 
		//autocloseable을 implement한 객체는 자동으로 close()함.
			
		try(obj){
			throw new Exception(); //강제로 exception 발생 
		}catch(Exception e) {
			System.out.println("exception");
		}
		
		System.out.println("end");
	}

}
