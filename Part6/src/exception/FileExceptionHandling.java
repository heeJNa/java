package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		//FileInputStream fis = null;
		
		//FileInputStream�� AutoCloseable�� implement�� 
		try(FileInputStream fis = new FileInputStream("a.txt")) {	//�ڵ����� close ��.
				//fis = new FileInputStream("a.txt");
				System.out.println("read");
				
		}catch(FileNotFoundException e	) {
			System.out.println(e);
		}catch(IOException e) {
			e.printStackTrace();
		}
		/*finally {	//try������ �Ҹ��� �׻� �Ҹ�.
			if(fis != null) {	//���������� �ݾƾ� ��.
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
