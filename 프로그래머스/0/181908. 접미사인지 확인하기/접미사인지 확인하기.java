class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int a = my_string.length();
        int b = is_suffix.length();
        
        if (b > a) answer = 0;
        else if (my_string.substring(a - b).equals(is_suffix)) answer = 1;
        
        return answer;
    }
}