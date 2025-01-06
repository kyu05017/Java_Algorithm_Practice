package src.main._2강;

import java.util.Arrays;

public class _004_solution_02 {

	public static void main(String[] args){
		solution(new int[]{4,1,3,2});
	}

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

}
