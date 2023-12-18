import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = new String[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            a[i] = Character.toString(s.charAt(i));
        }
        
        Arrays.sort(a);
        
        for (int i = a.length - 1; i >= 0; i--) answer += a[i];
        
        return answer;
    }
}