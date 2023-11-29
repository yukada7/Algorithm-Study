class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long a = 0;
        
        for (int i = 1; i <= count; i++) {
            a += price * i;
        }
        
        return answer = a > money ? a - money : 0;
    }
}