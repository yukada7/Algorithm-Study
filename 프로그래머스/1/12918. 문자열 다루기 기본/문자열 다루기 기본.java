class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.toString(s.charAt(i)).matches("^[a-zA-Z]*$")) {
                    answer = false;
                    break;
                } else {
                    answer = true;
                }
            }
        } else {
            answer = false;
        }
        
        return answer;
    }
}