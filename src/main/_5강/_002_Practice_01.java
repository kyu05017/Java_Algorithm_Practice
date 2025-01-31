package src.main._5강;

import java.util.Stack;

public class _002_Practice_01 {

	public static void main(String[] args){
		System.out.println(sol2("(())()"));
	}

	// 내풀이 01 - 실패
	private static boolean sol(String s){
		boolean answer = false;

		char[] arr = s.toCharArray();

		for(int i = 0; i < arr.length; i++){
			if(i%2==0){
				if(String.valueOf(arr[i]).equals("(") != true){
					return false;
				}
			}else{
				if(String.valueOf(arr[i]).equals(")") != true) {
					return false;
				}
			}
			answer = true;
		}
		return answer;
	}

	// 내풀이 02 - 성공
	private static boolean sol2(String s){
		boolean answer = true;
		int isOkay = 0;

		char[] arr = s.toCharArray();

		// 전체가 짝수 인가?
		if(arr.length %2 != 0)return false;

		// 여는 소괄호로 시작인가?
		if(arr[0] != '(')return false;

		for(char c : arr){
			if(c=='('){
				isOkay++;
			}else{
				if(isOkay == 0)return false;
				isOkay--;
			}
		}

		return isOkay==0?true:false;
	}

	// 강의 풀이 01
	private static boolean sol3(String s){
		Stack<Character> stack = new Stack<>();

		for(char c : s.toCharArray()){
			if(c == '(') stack.push(c);
			else {
				if(stack.isEmpty())return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
