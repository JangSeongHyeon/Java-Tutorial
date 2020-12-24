
public class Ex2_12 {

	public static void main(String[] args) {
		String str="3"; //문자열3
		
		System.out.println(str.charAt(0)-'0'); 
		//문자열 3을 문자3으로
		// '3'-'0', 문자3에서 문자0을 빼면 숫자 3이된다.
		// 3.chartAt(0)으로 써도된다.
		
		System.out.println('3'-'0'+1);
		// 문자 3에서 문자0을 빼니까 3
		// 숫자 3+ 숫자 1 = 4
		
		System.out.println('3'+1); //52
		System.out.println("3"+1); //31
		// "3"+"1"
		// "31"
		
		System.out.println(Integer.parseInt("3")+1);
		// "3" -> 3
		// 3+1 = 4
		
		System.out.println((char)(3+'0'));
		//숫자에 문자'0'을 더하면 문자가 된다.
		
		
		
		

	}

}
