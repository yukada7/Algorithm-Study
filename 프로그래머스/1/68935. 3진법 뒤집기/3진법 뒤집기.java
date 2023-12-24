class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String a = Integer.toString(n, 3);
        String b = "";
        
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        
        answer = Integer.parseInt(b, 3);
        
        return answer;
    }
}