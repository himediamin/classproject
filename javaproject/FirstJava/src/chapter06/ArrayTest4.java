package chapter06;

public class ArrayTest4 {

	public static void main(String[] args) {

//		2차원 배열 : 1차원 배열의 집합.
//		 
//		생성할때
//		 
//		int[][] arr
//		new int[][]

		int[][] arr = new int[2][3];

//		arr은 (요소개수가 4개인 1차원 배열) 3개를 가지는 배열 인스턴스를 가르킨다
//		1차원 배열의 사이즈는 4

		System.out.println("2차원 배열의 사이즈 : " + arr.length);

		System.out.println("첫번째 1차원 배열의 사이즈 : " + arr[0].length);
		System.out.println("두번째 1차원 배열의 사이즈 : " + arr[1].length);

//		배열 요소의 참조

		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[0][2] = 13;
		arr[1][0] = 21;
		arr[2][0] = 22;
		arr[3][0] = 23;
		
		for(int i=0; length; i++) {
			fot(int j=0; j<3; j++){
				System.out.println("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
			}
			
			System.out.println();
		}

	}

}
