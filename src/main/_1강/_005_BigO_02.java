package src.main._1강;

public class _005_BigO_02 {

	public static void main(String[] args){
		int[] a = {1,2,3};
		System.out.println("결과물 : " + solution(a));
	}

	private static int solution(int[] n){
		int s = 0;

		for(int x : n){
			s += x;
		}

		return  s;
	}
	// 배열 a가 늘어날수록 연산량이 증가 함으로 O(n)
}
