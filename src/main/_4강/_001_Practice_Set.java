package src.main._4강;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class _001_Practice_Set {
	public static void main(String[] args){

		List<Integer> list = new LinkedList<>();

		list.add(1);
		list.add(2);
		list.add(3);

		// 리스트에 1이 없으면 추가
		if(!list.contains(1))list.add(1);
		if(!list.contains(2))list.add(2);
		if(!list.contains(3))list.add(3);

		HashSet<Integer> set = new HashSet<>();

		//중복으로 추가할 수 없음.
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
	}
}
