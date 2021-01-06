public class Ex6_4 {
	public static void main(String[] args) {
		MyMath mm=new MyMath();
		
		long result1=mm.add(5L, 3L);
		long result2=mm.substract(5L, 3L);
		long result3=mm.multiply(5L, 3L);
		double result4=mm.divide(5L, 3L);
		long result5=mm.max(9, 12);
		mm.printGugudan(12);	//구구단 3단을 출력
		
		System.out.println("add(5L,3L) = "+result1);
		System.out.println("substract(5L,3L) = "+result2);
		System.out.println("multiply(5L,3L) = "+result3);
		System.out.println("divide(5L,3L) = "+result4);
		System.out.println("max(9L,12L) = "+result5);
	}
	
}

class MyMath{
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9))
			return;		//입력받은 단(dan)이 2~9가아니면, 메서드 종료하고 돌아가기
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		}
	}
	long add(long a, long b) {
		long result=a+b;
		return result;
		// return a+b;  -> 위의 두줄을 이와 같이 한줄로 나타낼 수도 있다
	}
	
	// 두 값을 받아서 둘 중에 큰 값을 반환하는 메서드르 작성하시오
	
	long max(long a, long b) {
		if(a>b)
			return a;	// 조건식이 참일때만 실행
		else
			return b;	//조건식이 거짓일때도 값을 반환
	}
	
	long substract(long a, long b) { return a-b; };
	long multiply(long a, long b) { return a*b; };
	double divide(double a, double b) {
		return a/b;
	}
}
