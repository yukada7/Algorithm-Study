class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char tmp = my_string.charAt(i);
            
            if ((65 <= tmp) && (tmp <= 90)) {
                answer += my_string.valueOf(tmp).toLowerCase();
            } else if ((97 <= tmp) && (tmp <= 122)) {
                answer += my_string.valueOf(tmp).toUpperCase();
            } else {
                answer += (char)tmp;
            }
        }
        return answer;
    }
}