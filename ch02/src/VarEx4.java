
public class VarEx4 {

	public static void main(String[] args) {
		char ch='A';	//A , ''�ȿ��� �ݵ�� �����ϳ��� ������
		int i='A';	//65
		
		String str="";	//OK, �� ���ڿ�(empty string)
		String str2="ABCD";	//OK
		String str3="123";
		String str4=str2+str3;	//ABCD123, str2�� str3�� ���ڿ��� ���� 
		
		System.out.println(""+7+7);	//77
		System.out.println(7+7+"");	//14 
	}

}
