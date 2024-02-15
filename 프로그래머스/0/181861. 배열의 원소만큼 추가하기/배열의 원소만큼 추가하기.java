class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        
        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        cnt = 0;
        
        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                answer[cnt] = a;
                cnt++;
            }
        }
        
        return answer;
    }
}