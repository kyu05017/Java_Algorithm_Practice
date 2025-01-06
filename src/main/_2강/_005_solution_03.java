package src.main._2강;

import java.util.Arrays;
import java.util.*;
public class _005_solution_03 {

	public static void main(String[] args){
		solution02(12345);
	}
	// 내풀이
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
	// 강의 풀이 List 활용
	private static int[] solution02(long n){
		int[] answer = {};
		List<Integer> list = new LinkedList<>();
		while (n < 0){
			list.add((int)n % 10);
			n/=10;
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
