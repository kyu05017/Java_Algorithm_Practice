package src.main._1강;

import java.util.Arrays;

public class _008_BigO_05 {

	public static void main(String[] args){

		int[] a = {1,2,3,4,6};
		System.out.println("a 배열의 값 : " + Arrays.toString(a));
		System.out.println("결과 값 : " + solution(a));
	}

	private static int solution(int[] n){
		int s = 0;

		for(int i = 0; i < n.length; i++){
			s += i;
			for(int j = 0; j < 10; j++){
				s += j;
			}
		}
		return s;
	}
	// for 문이 두개 있다고 한들, 두번째 반복문의 연산이 고정되어 있을 경우에는 O(n+10)이 아닌
	// O(n)이다.
	// 수학적인 정확도가 아닌 척도 이기 때문이다.
}
