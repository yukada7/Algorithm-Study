class Solution {
    public int solution(int order) {
        int answer = 0;
        String value = Integer.toString(order);
        
        for (int i = 0; i < value.length(); i++) {
            int a = value.charAt(i) - '0';
            if (a == 3) {
                answer++;
            } else if (a == 6) {
                answer++;
            } else if (a == 9) {
                answer++;
            }
        }
        
        return answer;
    }
}