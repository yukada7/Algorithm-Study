class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int c = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int d = 2 * a * b;
        
        if (c >= d) {
            answer = c;
        } else {
            answer = d;
        } 
        
        return answer;
    }
}