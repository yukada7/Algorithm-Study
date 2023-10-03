class Solution {
    public int[] solution(int n, int[] numlist) {
        int length = 0;
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                length++;
            }
        }
        
        int[] answer = new int[length];
        int cnt = 0;
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[cnt] = numlist[i];
                cnt++;
            }
        }
        
        return answer;
    }
}