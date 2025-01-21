package src.main._4강;

import java.util.*;
import java.util.stream.Collectors;

public class _004_Practice_03 {
	public static void main(String[] args){

		//System.out.println(Arrays.toString(sol(new int[]{1,1,3,3,0,1,1})));
		System.out.println(Arrays.toString(sol3(new int[]{1,1,3,3,0,1,1})));
	}
	private static int[] sol(int[] arr){
		return Arrays.stream(arr).distinct().boxed().collect(Collectors.toList()).stream().mapToInt(Integer::intValue).toArray();
	}

	private static int[] sol2(int[] arr){
		List<Map<Integer,Integer>> list = new ArrayList<>();
		List<Integer> returnList = new ArrayList<>();

		Map<Integer,Integer> map = null;
		for(int i = 0;i< arr.length;i++){

			if(arr.length == i+1){
				break;
			}

			map = new LinkedHashMap<>();

			System.out.println(arr[i]);
			System.out.println(arr[i+1]);
			if(arr[i] != arr[i+1]){
				map.put(arr[i],map.getOrDefault(map.get(arr[i]),0)+1);
				list.add(map);
			}
		}
		for(Map s : list){
			Set set2 = s.keySet();
			Iterator<Integer> iterator2 = set2.iterator();
			returnList.add(iterator2.next());
		}

		return returnList.stream().mapToInt(Integer::intValue).toArray();
	}

	// 1.강의 풀이
	private static int[] sol3(int[] arr){

		List<Integer> list = new ArrayList<>();

		int last = -1;
		for (int j : arr) {
			if (last == j) continue;
			last = j;
			list.add(j);

		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
