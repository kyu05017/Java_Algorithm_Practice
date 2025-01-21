package src.main._4강;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _002_Practice_01 {
	public static void main(String[] args){
		solution(new int[]{4,7,32,43,39,20});
	}
	private static void solution(int[] lotto){

		boolean re = true;

		List<Integer> list = Arrays.stream(lotto).distinct().filter(e-> e > 0 && e < 46).boxed().collect(Collectors.toList());

		if(list.size() != 6){
			re = false;
		}

		System.out.println(re);
	}
	// 강의 풀이1
	private static boolean sol(int[] lotto){
		boolean[] check = new boolean[45+1];
		for(int s : lotto){
			if(s < 1 || s > 45)return false;
			if(check[s])return false;
			check[s] = true;
		}
		return true;
	}

	// set 이용 풀이
	private static boolean sol2(int[] lotto){
		Set<Integer> set = new HashSet<>();
		for(int s : lotto){
			if(s < 1 || s > 45)return false;
			set.add(s);
		}
		return set.size() == lotto.length;
	}
}
