import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int ansCnt = 0;
        
        for (int i = 0; i < commands.length; i++) {
            int[] ary = new int[commands[i][1] - commands[i][0] + 1];
            int cnt = 0;
            
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                ary[cnt] = array[j - 1];
                cnt++;
            }
            
            Arrays.sort(ary);
            
            answer[ansCnt] = ary[commands[i][2] - 1];
            ansCnt++;
        }
        
        return answer;
    }
}