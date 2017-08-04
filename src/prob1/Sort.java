package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		// 정렬 전 배열 출력
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		boolean fail = false;
		int cnt = 0;
		
		for(int j = 0; j < (count-1); j++)
		{
			fail = false;
			for(int i = 0; i < (count-1); i++)
			{
				if(array[i] < array[i+1])
				{
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					fail = true;
				}
			}
			cnt++;
			if(fail == false) break;
		}
		
		// 정렬 후 배열 출력
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}