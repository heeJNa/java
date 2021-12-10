package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		//FileInputStream fis = null;
		
		//FileInputStream이 AutoCloseable을 implement함 
		try(FileInputStream fis = new FileInputStream("a.txt")) {	//자동으로 close 됨.
				//fis = new FileInputStream("a.txt");
				System.out.println("read");
				
		}catch(FileNotFoundException e	) {
			System.out.println(e);
		}catch(IOException e) {
			e.printStackTrace();
		}
		/*finally {	//try구문이 불리면 항상 불림.
			if(fis != null) {	//열렸을때만 닫아야 함.
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally");
		}*/
		
		System.out.println("end");
	}

}
