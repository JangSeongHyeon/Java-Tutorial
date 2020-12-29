
public class FlowEx15 {

	public static void main(String[] args) {
		System.out.println("수 \t 짝수 \t 홀수 \t 지수 \t 역순 \t 순환 \t 연속반복");
		System.out.println("-----------------------------------------------------------");
		
		for(int i=1;i<=10;i++)
			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n",i,2*i,2*i-1,i*i,11-i,i%3,i/3);

	}

}
