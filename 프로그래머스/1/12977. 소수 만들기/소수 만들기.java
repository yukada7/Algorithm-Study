class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int a = nums[i] + nums[j] + nums[k];
                    int cnt = 0;
                    
                    for (int l = 1; l <= a; l++) {
                        if (a % l == 0) {
                            cnt++;
                        }
                    }
                    
                    if (cnt == 2) answer++;
                }
            }
        }

        return answer;
    }
}