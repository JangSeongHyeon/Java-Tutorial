
public class VarEx3 {

	public static void main(String[] args) {
		
		boolean power=true;
		System.out.println(power);
		
		byte b=127; //byte -128~127

		int oct=010; //8����, 10�����δ� 8
		int hex=0x10; //16����, 10�����δ� 16
		
		long l=10_000_000_000L;
		// intger ���ͷ��� 100���� �Ѿ�� type mismatch�̱� �빮�� longŸ������ �ٲ���
		
		float f=3.14f;
		// f�� ������� ���ͷ��� double���� �Ǳ⶧���� type mismatch
		
		double d=3.14f;
		// �������� dobule�� ���ͷ��� Ÿ���� float������ �� ũ�� ������ �����߻�x
		
		
		System.out.println(10.); // 10.0
		System.out.println(.10); // 0.1
		System.out.println(10f); // 10.0
		System.out.println(1e3); // 1000.0
	}

}
