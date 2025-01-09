package src.main._3강;

import java.util.HashMap;
import java.util.Map;

public class _004_Practice_03 {
	public static void main(String[] args){
		String[][] a = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
		// headgear : 2 경우의 수 : 3개
		// eyewear : 1  경우의 수 : 2개

		// 모든 경우의 수는 3 X 2 == 6
		// 위장을 안하는 경우 6 - 1 == 5
	}

	private static int solution(String[][] clothes){
		int answer = 1;

		Map<String,Integer> map = new HashMap<>();
		// 위장용품의 종류별 개수를 구한다.
		for(String[] c : clothes){
			String type = c[1];
			map.put(type,map.getOrDefault(type,0)+1);
		}

		// 각 개수의 +1 을 모두 곱한다.
		var iter = map.values().iterator();
		while (iter.hasNext()){
			answer *= iter.next() + 1;
		}

		// -1 해서 리턴한다.
		return answer-1;
	}
}
