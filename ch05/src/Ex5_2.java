
public class Ex5_2 {

	public static void main(String[] args) {
		// index범위: 0~9
		int[] arr=new int[9]; //길이가 5인 int배열 arr을 생성
		System.out.println("arr.length="+arr.length);

		for(int i=0;i<10;i++) {	// index의 범위를 벗어나서 에러
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}

}
