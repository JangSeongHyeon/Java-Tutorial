import java.util.*;

public class Ex4_4 {

	public static void main(String[] args) {
		int score=0;	// ������ �����ϱ� ���� ����
		char grade=' '; // ������ �����ϱ� ���� ����. �������� �ʱ�ȭ�Ѵ�.
		
		System.out.println("������ �Է��ϼ���.>");
		Scanner scanner=new Scanner(System.in);
		score=scanner.nextInt();	//ȭ���� ���� �Է¹��� ���ڸ� score�� ����
		
		if(score>=90) {		//score�� 90������ ũ�ų� ������ A����
			grade='A';
		}else if(score>=80) {	//score�� 80������ ũ�ų� ������ B����
			grade='B';
		}else if(score>=70) {	//score�� 70������ ũ�ų� ������ C����
			grade='C';	
		}else {		//�������� D����
			grade='D';
		}
		
		System.out.println("����� ������"+grade+"�Դϴ�");

	}

}
