
public class Ex2_12 {

	public static void main(String[] args) {
		String str="3"; //���ڿ�3
		
		System.out.println(str.charAt(0)-'0'); 
		//���ڿ� 3�� ����3����
		// '3'-'0', ����3���� ����0�� ���� ���� 3�̵ȴ�.
		// 3.chartAt(0)���� �ᵵ�ȴ�.
		
		System.out.println('3'-'0'+1);
		// ���� 3���� ����0�� ���ϱ� 3
		// ���� 3+ ���� 1 = 4
		
		System.out.println('3'+1); //52
		System.out.println("3"+1); //31
		// "3"+"1"
		// "31"
		
		System.out.println(Integer.parseInt("3")+1);
		// "3" -> 3
		// 3+1 = 4
		
		System.out.println((char)(3+'0'));
		//���ڿ� ����'0'�� ���ϸ� ���ڰ� �ȴ�.
		
		
		
		

	}

}
