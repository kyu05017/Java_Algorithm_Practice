package src.main._3강;

import java.util.LinkedHashMap;
import java.util.Map;

public class _003_Practice_02 {

	public static void main(String[] args){
		String[] a = {"leo", "kiki", "eden"};
		String[] b = {"eden", "kiki"};

		solution(a,b);
	}

	static String solution(String[] a, String[] b){
		String answer = "";

		Map<String,Integer> map = new LinkedHashMap<>();

		for(String i : a){
			map.put(i,0);
		}

		for(String j : b){
			map.put(j, map.get(j)+1);
		}

		System.out.println(map);

		for(Map.Entry<String,Integer> entry : map.entrySet()){
			if(entry.getValue() == 0 || entry.getValue() > 1){
				answer = entry.getKey();
			}
		}

		return answer;
	}
}
