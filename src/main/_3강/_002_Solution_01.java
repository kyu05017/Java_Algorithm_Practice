package src.main._3강;

import java.util.*;
import java.util.stream.Stream;

public class _002_Solution_01 {

	public static void main(String[] a){
		solution001(new int[]{3,1,2,3});
	}

	// 강의 풀이 01 - map 사용
	static int solution001(int[] nums) {
		// [3,3,3,2,2,2]
		// [3,2] : 2개 중복제거
		// n/2 : 3개 지만 가져갈 수 있는 종류는 2개
		// 최소값을 선택한다.

		// [3,1,2,3]
		// [1,2,3] : 3개 중복제거
		// n/2 : 2개
		// 답은 2개

		//1. 포켓몬 종류의 갯수를 구한다.
		Map<Integer,Integer> map = new HashMap<>();

		for(int a : nums){
			map.put(a,0);
		}
		int n1 = map.keySet().size();

		//2. 배열크기의 n/2를  구한다.
		int n2 = nums.length/2;

		//3. 최소값을 선택한다.
		return Math.min(n1,n2);
	}
	//2. 강의 풀이 02 - list 사용
	static int solution002(int[] nums){
		List<Integer> list = new LinkedList<>();
		for(int n : nums)if(!list.contains(n))list.add(n);
		return Math.min(list.size(),nums.length/2);
	}
}
