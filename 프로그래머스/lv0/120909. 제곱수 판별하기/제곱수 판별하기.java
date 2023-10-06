class Solution {
    public int solution(int n) {
        int answer = 0;
        int value = 1;
        
        while (true) {
            if (value * value > n) {
                answer = 2;
                break;
            } else if (value * value < n) {
                value++;
            } else {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}