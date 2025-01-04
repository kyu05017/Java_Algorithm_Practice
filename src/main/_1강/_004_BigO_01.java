package src.main._1강;

public class _004_BigO_01 {

	public static void main(String[] args){

		int[] a = {2,3,4};
		System.out.println("결과물 : " + solution(a));
	}

	private static int solution(int[] n){
		if(n.length < 3){
			return 0;
		}
		int a = n[0];
		a += n[1];
		a += n[2];

		return a;
	}

	// 연산량이 고정되어 있고 일정하기 때문에 시간 복잡도는 O(1)
}
