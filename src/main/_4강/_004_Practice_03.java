package src.main._4강;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _004_Practice_03 {
	public static void main(String[] args){

		System.out.println(Arrays.toString(sol(new int[]{1,1,3,3,0,1,1})));

	}
	private static int[] sol(int[] arr){
		return Arrays.stream(arr).distinct().boxed().collect(Collectors.toList()).stream().mapToInt(Integer::intValue).toArray();
	}
}
