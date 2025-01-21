package src.main._4강;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _003_Practice_02 {
	public static void main(String[] args){
		sol(new String[]{"tank", "kick", "know", "wheel", "land", "dream"});
	}
	private static void sol(String[] words){

		boolean re = true;

		// 1. 중복이 존재하는가?
		List<String> list = Arrays.stream(words).distinct().toList();

		if(list.size() != words.length){
			re = false;
		}

		// 2. 아니라면, 단어들이 올바르게 끗말잇기를 하는가
		for(int i = 0; i < list.size(); i++){

			if(i == list.size()-1){
				break;
			}

			String word = list.get(i);
			String nextWord = list.get(i+1);
			String beforeLastWord = String.valueOf(word.charAt(word.length() - 1));
			if (!nextWord.startsWith(beforeLastWord)) {
				re = false;
				break;
			}

		}

		System.out.println(re);
	}

	// 1.강의 풀이
	private static boolean sol2(String[] words){
		Set<String> set = new HashSet<>();

		set.add(words[0]);
		char last = words[0].charAt(words[0].length()-1);
		for(int i = 1; i < words.length; i++){
			String w = words[i];
			char first = w.charAt(0);
			if(last != first)return false;
			if(!set.add(words[i])) return false;
		}

		return true;
	}
}
