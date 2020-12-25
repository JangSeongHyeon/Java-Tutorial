
public class Ex4_7 {

	public static void main(String[] args) {
		int num=0;
		
		// 괄호 { }안의 내용을 5번 반복한다.
//		for (int i=1;i<=5;i++) {
//			num=(int)(Math.random()*6)+1;
//			System.out.println(num);
//		}
		
		//Quize 1~10사이의 난수를 20개 출력하시오
//		for (int i=1;i<11;i++) {
//			System.out.println(Math.random()); // 0.0 <=x< 1.0
//			System.out.println(Math.random()*10); // 0.0 <=x< 10.0
//			System.out.println((int)(Math.random()*10)); // 0 <=x< 10
//			System.out.println((int)(Math.random()*10)+1); // 1 <=x< 11
//		}
		
		// Quize2 -5~5 사이의 난수를 10개 출력해라
		// -5, -4, -3, -2, -1 ,0 , 1, 2, 3, 4, 5
		
		for(int i=1;i<=10;i++) {
			System.out.println((int)(Math.random()*11)); // 0 <= x < 11
			System.out.println((int)(Math.random()*11)-5); // -5 <= x < 6
		}
		
		
		
		

	}

}
