package src.main._5강;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _003_Practice_02 {
	public static void main(String[] args) {
		sol1(new int[]{95, 90, 99, 99, 80, 99},new int[]{1, 1, 1, 1, 1, 1});
	}

	// 내풀이 - 실패
	private static int[] sol1(int[] progresses, int[]speeds){
		List<Integer> days = new LinkedList<>();

		// 시간초과
		for(int i = 0;i< progresses.length;i++){
			int j = progresses[i];
			int day = 0;
			while(j < 100){
				j += speeds[i];
				day++;
			}
			days.add(day);
		}
		return new int[]{};
	}

	private static int[] sol2(int[] progresses, int[]speeds){
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> answer = new LinkedList<>();
		for(int i = 0;i<progresses.length;i++){
			float p = progresses[i];
			float s = speeds[i];

			int days = (int)Math.ceil((100 - p)/s);
			queue.offer(days);
		}

		int d = queue.poll();
		int cnt = 1;

		while(!queue.isEmpty()){
			int n = queue.poll();

			if(d >= n){
				cnt++;
				continue;
			}
			answer.offer(cnt);
			cnt=1;
			d = n;
		}
		answer.offer(cnt);
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

	private static int[] sol3(int[] progresses, int[]speeds){
		Queue<Integer> queue = new LinkedList<>();

		// progresses [93,30,55]
 		// speeds [1,30,5]
		for(int i = 0;i<progresses.length;i++){
			float p = progresses[i];
			float s = speeds[i];
			int days = (int)(Math.ceil(100 - p)/s);

			queue.offer(days);
		}
		//queue[7,3,9]
		Queue<Integer> queue2 = new LinkedList<>();


		int d = (!queue.isEmpty())?queue.poll():0;
		int cnt = 1;
		while(!queue.isEmpty()){
			int n = queue.poll();
			if(d >= n){
				cnt++;
				continue;
			}
			queue2.offer(cnt);
			cnt = 1;
			d = n;
		}
		queue2.offer(cnt);
		return queue2.stream().mapToInt(Integer::intValue).toArray();
	}
}
