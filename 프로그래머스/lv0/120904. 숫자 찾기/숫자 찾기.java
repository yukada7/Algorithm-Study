class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String a = Integer.toString(num);
        
        for (int i = 0; i < a.length(); i++) {
            if (k == a.charAt(i) - '0') {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}