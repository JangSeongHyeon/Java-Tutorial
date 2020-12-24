
public class EX3_12 {

	public static void main(String[] args) {
		double pi=3.141592; //3.141
		
		System.out.println(pi*1000);
		
		
		System.out.println((int)(pi*1000)); 
		
		
		// 형변환을 통해 일부러 값 손실을 낸다, 실수를 정수로 바꿔서
		
		System.out.println((int)(pi*1000)/1000.0); 
		
		
		// 다시 값을 1000.0으로 나눠주면 된다.
		
		

	}

}
