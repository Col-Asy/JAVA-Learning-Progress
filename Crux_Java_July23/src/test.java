import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		String[] words1 = {"amazon","apple","facebook","google","leetcode"}, words2 = {"e","o"};
		System.out.println();
		wordSubsets(words1, words2);
	}

	public static void wordSubsets(String[] words1, String[] words2) {
		for(String letter : words2) {
			for(String words : words1) {
				if(words.contains(letter)) System.out.println(words);
			}
		}
    }
}
