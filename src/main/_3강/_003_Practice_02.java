package src.main._3강;

import java.util.*;

public class _003_Practice_02 {

	public static void main(String[] args){
		String[] a = {"leo", "kiki", "eden"};
		String[] b = {"eden", "kiki"};

		solution(a,b);
	}

	// 실패 풀이
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

	// 시간 초과 풀이
	static String solution01(String[] a, String[] b){
		List<String> list = new LinkedList<>();

		Collections.addAll(list, a);
		for(String j : b)list.remove(j); // <---remove를 하기위해 찾아가는 시간이 오래걸린다.

		return list.getFirst();
	}

	// 정답풀이 (Map)
	static String solution02(String[] a, String[] b){
		Map<String,Integer> map = new HashMap<>();

		for(String p : a)map.put(p,map.getOrDefault(p,0)+1);

		for(String p : b){
			int n = map.get(p) -1;
			if(n == 0){
				map.remove(p);
			} else {
				map.put(p,n);
			}
		}
		return map.keySet().iterator().next();
	}

	// 정렬 방식
	static String solution03(String[] a, String[] b){
		Arrays.sort(a); // O(nlogn)
		Arrays.sort(b); // O(nlogn)

		// O(n)
		for(int i = 0; i < b.length; i++){
			if(!a[i].equals(b[i])) return a[i];
		}

		return a[a.length-1];
	}
}
