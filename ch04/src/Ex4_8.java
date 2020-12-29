
public class Ex4_8 {

	public static void main(String[] args) {
		//1부터 3까지 1씩 증가, i=1,3,5,7,9,11
		for(int i=1;i<=10;i=i+2) {		// 괄호{ }안의 문장을 3번 반복
			System.out.println("Hello");
		}

		for(int i=10;i>=1;--i) {		// 괄호{ }안의 문장을 3번 반복
			System.out.println(i);
		}
		
		for(int i=1,j=10; i<=10;i++,j--) {
			System.out.println("i="+i+",j="+j);
		}
		
	}

}
