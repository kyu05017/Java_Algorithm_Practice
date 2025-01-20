package src.main._4강;

import java.util.Arrays;
import java.util.List;

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
}
