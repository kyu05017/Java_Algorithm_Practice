package src.main._5강;

import java.util.Arrays;

public class _004_Practice_03 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sol2(new int[]{1,2,3,2,3})));
	}

	// 내풀이 실패 O(nlogn)
	private static int[] sol1(int[] prices){
		int[] answesr = new int[prices.length];
		// [1,2,3,2,3] --> [4,3,1,1,0]

		// 0번 케이스
		// 0번 인덱스 값 1이 배열이 끝나는 동안 자기 자신보다 낮아 지지 않았음
		// 1 : 1
		// 2 : 2
		// 3 : 3
		// 4 : 4

		// 1번 케이스
		// 1번 인덱스 값 2는 배열이 끝나는 동안 자기 자신보다 낮아 지지 않았음
		// 2 : 1
		// 3 : 2
		// 4 : 3

		// 이하 동일

		for(int i = 0; i <prices.length;i++){
			int cnt = 0;
			int price = prices[i];

			for(int j = i+1; j< prices.length;j++){
				if(price <= prices[j]){
					cnt++;
				}
			}
			answesr[i] = cnt;
		}
		return answesr;
	}

	private static int[] sol2(int[] prices){
		int[] answer = new int[prices.length];

		for(int i = 0;i < prices.length;i++){
			int price = prices[i];
			int cnt = 0;
			for(int j = i+1;j<prices.length;j++){
				cnt++;
				if(price > prices[j])break;
			}
			answer[i] = cnt;
		}

		return answer;
	}
}
