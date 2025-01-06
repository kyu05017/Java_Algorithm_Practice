package src.main._2강;

import java.util.Arrays;

public class _005_solution_03 {

	public static void main(String[] args){
		solution(12345);
	}
	private static int[] solution(long n){
		int j = 0;
		char[] e = String.valueOf(n).toCharArray();
		int[] answer = new int[e .length];
		for(int i = e.length-1;i>=0;i--){
			answer[j] = Integer.parseInt(e[i]+"");
			j++;
		}
		return answer;
	}
}
