package src.main._5강;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _005_Practice_04 {
	public static void main(String[] args) {
		sol1(new int[]{2,1,3,2},2);
	}

	private static int sol1(int[] priorities, int location){
		int answer = 0;

		// [2,1,3,2]
		// 찾을 위치 : 2번 인덱스
		int getMy = priorities[location];
		List<Paper> list = new LinkedList<>();

		for(int i = 0;i< priorities.length;i++){
			list.add(new Paper(priorities[i],i==location));
		}

		Paper now = list.remove(0);

		return answer;
	}

}
class Paper {
	boolean isMine;
	int priority;
	Paper(int p, boolean m){
		priority = p;isMine = m;
	}
}
