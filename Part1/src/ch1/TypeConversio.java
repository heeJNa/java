package ch1;

public class TypeConversio {

	public static void main(String[] args) {

		/*
		byte bNum = 10;
		int iNum = bNum;  //bNum�� int������ ��ȯ��.
		
		System.out.println(iNum);

		int iNum1 = 20;
		float fNum = iNum1;	//iNum1�� float������ ��ȯ��.
		
		System.out.println(fNum);

		int iNum2 = 150;
		byte bNum1 = (byte)iNum2;	//��������ȯ : �ڷᰡ ���ǵ� �� ����.
		
		System.out.println(bNum1);

		double dNum = 3.14;
		int iNum3 = (int)dNum;	//��������ȯ : �ڷᰡ ���ǵ� �� ����.
		
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
