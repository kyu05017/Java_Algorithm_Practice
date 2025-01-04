package src.main._1강;

import java.util.Arrays;

public class _007_BigO_04 {

	public static void main(String[] args){

		int[] a = {1,2,3,4};
		solution(a);
		System.out.println(Arrays.toString(a));
	}
	private static void solution(int[] a){
		int sum = 0;
		int max = a.length;

		while(max > 0){
			sum += a[max - 1];
			max /= 2;
		}
		System.out.println("a : "+ sum);
	}
	// 반복문을 돌면 최대치가 낮아져 연산하는 횟수가 절반 씩 줄어들기 때문에 O(logN) 이다.
}
