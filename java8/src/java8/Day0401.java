package java8;

public class Day0401 {
	public static void main(String[] args) {
		int a = 3 , b = 5;
		
		/*��Ʈ�̵�(shift) ������*/
		int res1 = a << 2;
		System.out.println(res1);
		//�������� x2�� �Ǳ� ������. 3x2 6x2 = 12
		
		int res2 = a>>1; //   /2�� �ȴ�.
		System.out.println(res2);
		
		int res3 = a >> 2;
		System.out.println(res3);
		
		int res4 = ~b; //��Ʈ ���� -5�� -1 �� ��. ��Ʈ ����������.
		System.out.println(res4);
		
		int res5 = res4 << 1; //-6���� 2�� ���Ѱ�.
		System.out.println(res5);
		
		int res6 = res4 >> 1;
		System.out.println(res6);
		
		int res7 = res4>>> 1; //�� ���� ���ڸ� 1�� �س��Ҵµ� ���� ���ڰ� ���´�(?)
		System.out.println(res7);
		
		//��Ʈ����������
		int res8 = a & b; //��Ʈ ���� �����ڴ� ��ȣ�� �ϳ��� ����մϴ�. 2���� ����������
						//a�� 3�̿��� 0011�� �ǰ�  b�� 5�ϱ� 0101�� �ȴ�.
						//0001 �� �Ǿ ���� 1�� ���´�.
		System.out.println(res8);
		
		int res9 = a|b;
		System.out.println(res9); //0111 �� ��. 0111�� 7
		
		int res10 = a ^ b;
		System.out.println(res10); //2���� ������ 0 , 0110 = 6
		
	}

}