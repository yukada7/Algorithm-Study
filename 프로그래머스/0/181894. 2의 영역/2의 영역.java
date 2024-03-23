class Solution {
    public int[] solution(int[] arr) {
        int firstIdx = -1;
        int lastIdx = 0;
        
        for (int i = 0; i < arr.length; i++) {
              if (arr[i] == 2) {
                  if (firstIdx == -1) firstIdx = i;
                  else lastIdx = i;
              }
        }
        
        int length = 0;
        
        if (lastIdx == 0) length = 1;
        else length = lastIdx - firstIdx + 1;
        
        int[] answer = new int[length];
        int cnt = 0;
        
        if (lastIdx == 0) {
            if (firstIdx == -1) answer[cnt] = -1;
            else answer[cnt] = arr[firstIdx];
        } else {
            for (int j = firstIdx; j < lastIdx + 1; j++) {
                answer[cnt] = arr[j];
                cnt++;
            }
        }
        
        return answer;
    }
}