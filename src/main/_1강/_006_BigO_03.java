package src.main._1강;

import java.util.Arrays;

public class _006_BigO_03 {

	public static void main(String[] args){
		int[] a = {23,1,6};
		System.out.println("정렬하기 전 값 : " + Arrays.toString(a));
		solution(a);
		System.out.println("정렬하기 후 값 : " + Arrays.toString(a));
	}
	private static void solution(int[] n){
		int cnt = n.length;
		// 버블정렬
		for(int i = 0; i < cnt; i++){
			for(int j = 0; j < cnt; j++){
				if (n[i] < n[j]){
					int temp = n[j];
					n[j] = n[i];
					n[i] = temp;
				}
			}
		}
	}
	// 배열이 증가하면 증가할수록 연산의 량이 제곱으로 늘어나기 때문에 O(n^2)의 시간복잡도를 가진다.
}
