import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        answer = my_string.toLowerCase();
        
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        
        return answer;
    }
}