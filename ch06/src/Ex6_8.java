class Data3{int x;}

public class Ex6_8 {

	public static void main(String[] args) {
		Data3 d=new Data3();
		d.x=10;
		
		Data3 d2=copy(d);
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x ="+d2.x);
	}
	
	// ��ȯ Ÿ���� ������
	static Data3 copy(Data3 d) {
		Data3 tmp=new Data3();	
		tmp.x=d.x;		
	
		return tmp;		
	}
}


//��ȯ Ÿ���� �������̶�� ���� ��ü�� �ּ�(��ü ��ü)�� ��ȯ�Ѵٴ� �ǹ�
		// ���� ��ȯ ���� �޴� ������ Ÿ�Ե� �������̾����
		
		
		// -> copy�޼��忡�� ������ ��ü�� main�޼��忡�� ����� �� ����
		// copy�� ȣ�� �� �� ���������� ���� ������
		// ���� Ŭ���� ���̱� ������(1)
		// static �޼���� ��ü ���� ���� ȣ�� �����ϱ� ������(2)
