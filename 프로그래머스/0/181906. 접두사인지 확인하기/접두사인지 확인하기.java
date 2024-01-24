class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        if (is_prefix.length() > my_string.length()) return answer = 0;
        
        for (int i = 0; i < is_prefix.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        
        return answer = is_prefix.equals(sb.toString()) ? 1 : 0;
    }
}