class Data3{int x;}

public class Ex6_8 {

	public static void main(String[] args) {
		Data3 d=new Data3();
		d.x=10;
		
		Data3 d2=copy(d);
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x ="+d2.x);
	}
	
	// 반환 타입이 참조형
	static Data3 copy(Data3 d) {
		Data3 tmp=new Data3();	
		tmp.x=d.x;		
	
		return tmp;		
	}
}


//반환 타입이 참조형이라는 것은 객체의 주소(객체 자체)를 반환한다는 의미
		// 따라서 반환 값을 받는 변수의 타입도 참조형이어야함
		
		
		// -> copy메서드에서 생성한 객체를 main메서드에서 사용할 수 있음
		// copy를 호출 할 때 참조변수가 없는 이유는
		// 같은 클래스 내이기 때문에(1)
		// static 메서드는 객체 생성 없이 호출 가능하기 때문에(2)
