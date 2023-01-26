package coding.words.medium;

import coding.math.easy.TwoSum;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {


    public static void main(String[] args) {

        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();

       int length = obj.lengthOfLongestSubstring("abcabcbb");
       System.out.println("abcabcbb --> " + length);
       assert length == 3;

        int length2 = obj.lengthOfLongestSubstring("bbbbb");
        System.out.println("bbbbb --> " + length2);
        assert length2 == 1;

        int length3 = obj.lengthOfLongestSubstring("pwwkew");
        System.out.println("pwwkew --> " + length3);
        assert length3 == 2;

        int length4 = obj.lengthOfLongestSubstring(" ");
        System.out.println(" " + length4);
        assert length4 == 1;

        int length5 = obj.lengthOfLongestSubstring("dvdf");
        System.out.println(" " + length5);
        assert length5 == 3;

    }

    public int lengthOfLongestSubstring(String s) {
        int finalCount = 0;
        Set<Character> wordSet = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(wordSet.contains(s.charAt(i))){
                finalCount = Math.max(wordSet.size(),finalCount);
                wordSet.clear();
                wordSet.add(s.charAt(i));
            } else {
                wordSet.add(s.charAt(i));
                finalCount = Math.max(wordSet.size(),finalCount);
            }
        }
        return finalCount;
    }

}
