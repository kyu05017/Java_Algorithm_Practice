package src.main._5강;

import java.util.*;

public class _001_Practice_StackAndQueue {

	public static void main(String[] args){
//		practice01();
//		practice02();
//		practice03();
		practice04();
	}
	// Deque
	private static void practice04(){

		Deque<Integer> deque = new ArrayDeque<>();

		deque.add(1);
		deque.add(2);
		deque.add(3);

		System.out.println(deque.toString());

		deque.offerFirst(0);
		System.out.println(deque.toString());

		deque.addFirst(-1);
		System.out.println(deque.toString());
	}
	// stack
	private static void practice03(){
		System.out.println("-------------Stack 구현 하기-------------");

		Stack<Integer> stack = new Stack<>();

		// 값을 삽입 push
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println("push() - 맨 뒤로  값을 추가.");
		System.out.println(stack.toString());

		// 값을 꺼내기 pop
		System.out.println("pop() - 맨 뒤의 값을 꺼내면서 지운다.");
		System.out.println(stack.pop());
		System.out.println(stack.toString());

		System.out.println(stack.pop());
		System.out.println(stack.toString());

		// 값을 확인  peak
		System.out.println("peak() - 맨 뒤의 값을 지우지 않고 확인하기.");
		System.out.println(stack.peek());
		System.out.println(stack.toString());

		System.out.println("-------------Stack 구현 하기-------------\n");
	}
	// Queue
	private static void practice02(){
		System.out.println("-------------Queue 구현 하기-------------");

		Queue<Integer> queue = new LinkedList<>();

		// 맨 뒤로  값을 추가.
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);

		System.out.println("offer() - 맨 뒤로  값을 추가.");
		System.out.println(queue.toString());

		// 맨 앞의 값을 꺼내면서 지운다.
		System.out.println("poll() - 맨 앞의 값을 꺼내면서 지운다.");
		System.out.println(queue.poll());
		System.out.println(queue.toString());

		System.out.println(queue.poll());
		System.out.println(queue.toString());

		// 맨 앞의 값을 지우지 않고 확인하기.
		System.out.println("poll() - 맨 앞의 값을 지우지 않고 확인하기.");
		System.out.println(queue.peek());
		System.out.println(queue.toString());

		System.out.println("-------------Queue 구현 하기-------------\n");
	}
	// LinkedList 로 Queue 와 Stack 구현 하기
	private static void practice01() {
		System.out.println("-------------LinkedList 로 Queue 와 Stack 구현 하기-------------");
		// Queue 동작원리
		System.out.println("- Queue -");
		List<Object> list = setList();

		// 꺼내면서 지운다.
		System.out.println("removeFirst() - 맨앞 요소를 꺼내면서 지운다.");
		System.out.println(list.removeFirst());
		System.out.println(list.toString());

		System.out.println(list.remove(1));
		System.out.println(list.toString());

		System.out.println(list.remove(1));
		System.out.println(list.toString() + "\n");

		// Stack
		System.out.println("- Stack -");
		list = setList();

		System.out.println("removeLast() - 맨뒤 요소를 꺼내면서 지운다.");
		System.out.println(list.removeLast());
		System.out.println(list.toString());

		System.out.println(list.removeLast());
		System.out.println(list.toString());

		System.out.println(list.removeLast());
		System.out.println(list.toString());
		System.out.println("-------------LinkedList 로 Queue 와 Stack 구현 하기-------------\n");
	}
	private static List<Object> setList(){
		List<Object> list = new LinkedList<>();
		for(int i = 1; i<=5; i++)
			list.add(i);

		return list;
	}
}
