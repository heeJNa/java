package iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {

	public static void main(String[] args) throws IOException {

		
		long millisecond = 0;
		
		/*try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")){
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i=fis.read()) != -1) {
				fos.write(i);
			}
			
			*/ //67475 millisecond 소모
		
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
		
			millisecond = System.currentTimeMillis();
			
			int i;
			while( ( i = bis.read()) != -1){
				bos.write(i);
			}
			

		
			millisecond = System.currentTimeMillis() - millisecond;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(millisecond + " 소모되었습니다.");	//169 millisecond 소모
		
		Socket socket = new Socket();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//보조스트림이 보조스트림을 감싸고 계속 감싼다. 맨 마지막은 기반 스트림을 감쌈.
		br.readLine();
	}

}
