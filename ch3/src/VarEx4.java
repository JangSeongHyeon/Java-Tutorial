
public class VarEx4 {

	public static void main(String[] args) {
		char ch='A';	//A , ''안에는 반드시 문자하나가 들어가야함
		int i='A';	//65
		
		String str="";	//OK, 빈 문자열(empty string)
		String str2="ABCD";	//OK
		String str3="123";
		String str4=str2+str3;	//ABCD123, str2와 str3의 문자열을 결합 
		
		System.out.println(""+7+7);	//77
		System.out.println(7+7+"");	//14 
	}

}
