
public class Ex4_8 {

	public static void main(String[] args) {
		//1���� 3���� 1�� ����, i=1,3,5,7,9,11
		for(int i=1;i<=10;i=i+2) {		// ��ȣ{ }���� ������ 3�� �ݺ�
			System.out.println("Hello");
		}

		for(int i=10;i>=1;--i) {		// ��ȣ{ }���� ������ 3�� �ݺ�
			System.out.println(i);
		}
		
		for(int i=1,j=10; i<=10;i++,j--) {
			System.out.println("i="+i+",j="+j);
		}
		
	}

}
