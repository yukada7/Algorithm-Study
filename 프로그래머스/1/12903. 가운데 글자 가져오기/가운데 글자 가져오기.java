class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        if (s.length() % 2 != 0) {
            sb.append(Character.toString(s.charAt(s.length() / 2)));
        } else {
            sb.append(Character.toString(s.charAt(s.length() / 2 - 1)));
            sb.append(Character.toString(s.charAt(s.length() / 2)));
        }
        
        return answer = sb.toString();
    }
}