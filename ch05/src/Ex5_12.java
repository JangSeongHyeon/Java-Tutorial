import java.util.Arrays;

public class Ex5_12 {

	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4};		// 1차원 배열 arr
		int[][] arr2D= {{11,12},{21,22}};	//2차원 배열
		int[] arr4= {3,4,1,0,2};
		
		System.out.println(Arrays.toString(arr));	//1차원 배열을 문자열로 바꿔서 출력
		System.out.println(Arrays.deepToString(arr2D));	//2차원 배열을 문자열로 바꿔서 출력
		
		String[][] str2D= {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2= {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(str2D==str2D2);	//참조변수 값 비교
		System.out.println(Arrays.deepEquals(str2D,str2D2));	//2차원 배열의 값비교
		
		int[] arr2=Arrays.copyOf(arr, arr.length); //arr을 arr.length만큼 복사하여 arr2를 만듬
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3=Arrays.copyOfRange(arr, 2,4);	//from~to까지 복사 to는 안들어감
		System.out.println(Arrays.toString(arr3));
		
		Arrays.sort(arr4);		//arr4를 오름차순으로 정렬
		System.out.println(Arrays.toString(arr4)); 	

	}

}
