package src.main._2강;

import java.util.Arrays;

public class _004_solution_02 {

	public static void main(String[] args){
		solution(new int[]{4,1,3,2});
	}
	// 내풀이
	private static boolean solution(int[] arr){
		boolean answer = true;

		Arrays.sort(arr);

		for(int i = 0; i < arr.length; i++){
			if (i+1 != arr[i]) {
				answer = false;
				break;
			}
		}

		return answer;
	}

	// 강의 풀이 01 (오답) - 사유 시간복잡도가 On^2이고, 틀리는 케이스가 존재
	private static boolean solution02(int[] arr){
		// n : 1 ~ n (1 ~ n 개의 수)
		int cnt = 0;
		for(int i = 0; i < arr.length; i++){
			for(int a : arr){
				if(a == i)cnt++;
			}
			if(cnt != 1)return false;
		}
		return true;
	}

	// 강의 풀이 02 시간복잡도는 O(nlogn)
	private static boolean solution03(int[] arr){
		int[] answer = new int[arr.length];
		for(int i = 0; i < arr.length; i++) answer[i] = i+1; // O(n)
		// arr : [0,0,0]
		// answer : [1,2,3]
		Arrays.sort(arr);// O(nlogn)
		return Arrays.equals(answer,arr); // O(n)
	}
}
