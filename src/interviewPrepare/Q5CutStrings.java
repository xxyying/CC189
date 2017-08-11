package interviewPrepare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Write a function that will take a page length and 
 * a long string of text and return a list of strings, 
 * each string representing one page of the original text. 
 * Avoid breaking across words and similar things.
 */


public class Q5CutStrings {
	public List<String> Paginage(String input, int lineLength) {
		List<String> words = Arrays.asList(input.split("\\s"));
		Iterator<String> wordItr = words.iterator();
		List<String> output = new ArrayList<>();
		List<String> page = new ArrayList<>();
		int curLength = 0;
		
		while(wordItr.hasNext()) {
			String nextWord = wordItr.next();
			int tmpPageLength = curLength + nextWord.length();
			if(tmpPageLength < lineLength) {
				page.add(nextWord);
				curLength = tmpPageLength + 1;
			} else {
				output.add(addSpaces(page, lineLength));
				page = new ArrayList<>();
				curLength = 0;
				page.add(nextWord);
				curLength = nextWord.length();
			}
		}
		
		if(!page.isEmpty()) {
			output.add(addSpaces(page, lineLength));
		}
		return output;
	}
	
	private String addSpaces(List<String> words, int lineLength) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < words.size() -1; i++) {
			String word = words.get(i);
			sb.append(word);
			sb.append(" ");
		}
		sb.append(words.get(words.size() - 1));
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Q5CutStrings test = new Q5CutStrings();
		int lineLength = 38;
		String str = "This is a test string longer than 40 characters in "
						+ "the pagination coding question. This is another "
						+ "test string not even longer than the previous sentence";
		List<String> result = test.Paginage(str, lineLength);
		for(String s: result) {
			System.out.println(s);
		}
	}

}
