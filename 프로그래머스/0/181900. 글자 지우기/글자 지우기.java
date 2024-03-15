class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] a = my_string.split("");
        
        for (int idx : indices) a[idx] = "";
        
        for (String c : a) answer += c;
        
        return answer;
    }
}