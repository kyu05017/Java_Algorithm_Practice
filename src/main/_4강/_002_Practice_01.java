package src.main._4강;

import java.util.Arrays;
import java.util.List;
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
}
