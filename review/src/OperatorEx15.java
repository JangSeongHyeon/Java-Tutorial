
public class OperatorEx15 {

	public static void main(String[] args) {
//		char a='A';
//		
//		for(int i=0;i<26;i++) {
//			System.out.print(a++);
//		}
//		
//		System.out.println();
//		
//		for(int i=0;i<26;i++) {
//			System.out.print(a++ +32);
//		}

		char lowerCase='a';
		char upperCase=(char)(lowerCase-32);
		System.out.println(upperCase);
		
		for(int i=0;i<26;i++) {
			System.out.print((char)(lowerCase++ -32));
		}
	}

}
