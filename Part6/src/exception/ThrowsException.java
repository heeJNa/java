package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
		
	}
	
	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		
		
			try {
				test.loadClass("a.txt", "java.lang.String");
			} catch (ClassNotFoundException | FileNotFoundException e) {
				System.out.println(e);
			} catch(Exception e) { //가장 위에 쓰면 안됨.
				System.out.println(e);
			}
		
		System.out.println("end");
	}

}
