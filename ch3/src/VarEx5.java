
public class VarEx5 {

	public static void main(String[] args) {
		int x=4, y=2;
		int tmp;
		
		tmp = x; // 1. tmp�� x�� ����  ����
		x=y; // 2. x�� y�� ����  ����
		y=tmp; // 3. y�� tmp�� ���� ����
		
		System.out.println("x="+x);
		System.out.println("y="+ y);
		
	}

}
