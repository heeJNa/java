package random_access_file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");	//�ι�° ���ڴ� ��弳��
		rf.writeInt(100);
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		rf.writeUTF("�ȳ��ϼ���"); //�ѱ��� 3����Ʈ�� ����.
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
	
		rf.seek(0);	//������ �̵�
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
	
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);

	}

}
