package src.main._2강;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class _003_solution_01 {
	public static void main(String[] args){
		solution(new int[]{1,3,5,4,5,2,1});
	}
	// 내 풀이
	public static int[] solution(int[] arr) {
		int[] answer = {};
		int max = arr[0];
		int maxCnt = 0;
		int j = 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[i] >= max){
				max = arr[i];
			}
		}

		for (int k : arr) {
			if (k == max) {
				maxCnt++;
			}
		}

		answer = new int[maxCnt];

		for(int i = 0; i < arr.length; i++){
			if(arr[i] == max){
				answer[j] = i;
				j++;
			}
		}
		return answer;
	}

	// 강의 풀이 (배열 풀이)
	private static int[] solution2(int[] arr){
		// 최대값 구하기
		int max = 0;
		for(int a : arr)if(a > max)max=a;
		// 최대값이 몇개인지 확인하기
		int cnt = 0;
		for(int a : arr)if(a==max)cnt++;
		// 배열만들기
		int[] answer = new int[cnt];
		// 인덱스 채우기
		int idx = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == max)answer[idx++] = i;
		}
		return answer;
	}
	// 강의 풀이 (List & Stream)
	private static int[] solution03(int[] arr){
		// 최대값 구하기
		int max = Arrays.stream(arr) // Arrays의 stream으로 stream으로 변환
				.max()// 최대값을 찻는다. 반환값 ( OptionalInt )
				.getAsInt(); // int형으로 변환

		// 리스트 만들기
		return IntStream.range(0,arr.length)//INtStream 의 range() 함수로 0 부터 필요한길이 (arr.length) 까지 생성
				.filter( i -> arr[i]==max) // 조건 : arr[i] 가 가장 큰숫자와 같을때만
				.toArray();// Array에 담는다.
	}
}
