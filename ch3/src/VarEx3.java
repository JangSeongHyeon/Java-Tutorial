
public class VarEx3 {

	public static void main(String[] args) {
		
		boolean power=true;
		System.out.println(power);
		
		byte b=127; //byte -128~127

		int oct=010; //8진수, 10진수로는 8
		int hex=0x10; //16진수, 10진수로는 16
		
		long l=10_000_000_000L;
		// intger 리터럴이 100억을 넘어가면 type mismatch이기 대문에 long타입으로 바꿔줌
		
		float f=3.14f;
		// f가 사라지면 리터럴이 double형이 되기때문에 type mismatch
		
		double d=3.14f;
		// 변수형의 dobule이 리터럴의 타입인 float형보다 더 크기 때문에 에러발생x
		
		
		System.out.println(10.); // 10.0
		System.out.println(.10); // 0.1
		System.out.println(10f); // 10.0
		System.out.println(1e3); // 1000.0
	}

}
