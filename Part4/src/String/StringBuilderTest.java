package String;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));	//새로운 메모리 사용.

		System.out.println();
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		System.out.println(System.identityHashCode(buffer));
		
		java = buffer.toString();
		System.out.println(java);
	}


}
