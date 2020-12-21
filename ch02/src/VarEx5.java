
public class VarEx5 {

	public static void main(String[] args) {
		int x=4, y=2;
		int tmp;
		
		tmp = x; // 1. tmp에 x의 값을  저장
		x=y; // 2. x에 y의 값을  저장
		y=tmp; // 3. y에 tmp의 값을 저장
		
		System.out.println("x="+x);
		System.out.println("y="+ y);
		
	}

}
