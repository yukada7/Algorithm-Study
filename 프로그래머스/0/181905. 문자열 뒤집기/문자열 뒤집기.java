class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String sub_string = my_string.substring(s, e + 1);
        StringBuilder sb = new StringBuilder(sub_string);
        
        return answer = my_string.replaceAll(sub_string, sb.reverse().toString());
    }
}