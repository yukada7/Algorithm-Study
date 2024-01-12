class Solution {
    public int solution(int n) {
        int answer = 1;
        int value = 0;
        
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                value += j;
                
                if (value > n) {
                    value = 0;
                    break;
                } else if (value == n) {
                    answer++;
                    value = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}