package ch1;

public class TypeConversio {

	public static void main(String[] args) {

		/*
		byte bNum = 10;
		int iNum = bNum;  //bNum이 int형으로 변환됨.
		
		System.out.println(iNum);

		int iNum1 = 20;
		float fNum = iNum1;	//iNum1이 float형으로 변환됨.
		
		System.out.println(fNum);

		int iNum2 = 150;
		byte bNum1 = (byte)iNum2;	//강제형변환 : 자료가 유실될 수 있음.
		
		System.out.println(bNum1);

		double dNum = 3.14;
		int iNum3 = (int)dNum;	//강제형변환 : 자료가 유실될 수 있음.
		
		System.out.println(iNum3);
		*/
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);


	}

}
