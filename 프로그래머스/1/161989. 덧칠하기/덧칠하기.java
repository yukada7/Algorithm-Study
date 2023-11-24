class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] pass = new int[n];
        
        for (int i = 0; i < n; i++) {
            pass[i] = 1;
        }
        
        for (int i = 0; i < section.length; i++) {
            pass[section[i] - 1] = 0;
        }
        
        for (int i = 0; i < pass.length; i++) {
            int idx = i;
            if (pass[i] == 0) {
                for (int j = 0; j < m; j++) {
                    if (idx < pass.length) {
                        pass[idx] = 1;
                        idx++;    
                    }
                }

                answer++;
            }
        }
        
        return answer;
    }
}