
public class EX3_9 {

	public static void main(String[] args) {
		int a=1_000_000; // 1백만= 10의 6제곱
		int b=2_000_000; // 2백만= 10의 6제곱
		
		
		long c=(long)-1454759936; 
		
		System.out.println(c);
		
		}

}

//10의 12제곱. int의 범위는 10의 9제곱 -> 범위를 넘어버린다.
		// a*b=2000,000,000,000 ?
		//long에 저장하려고한 것은 좋지만 계산한 결과가 int이기 때문에 오버플로우 발생
		
		// long c=a*b;
