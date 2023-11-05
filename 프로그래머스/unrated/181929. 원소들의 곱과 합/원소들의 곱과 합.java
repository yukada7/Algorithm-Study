class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int hap = 0;
        int gop = 1;
        
        for (int i : num_list) {
            hap += i;
            gop *= i;
        }
        
        if (Math.pow(hap, 2) > gop) {
            answer = 1;
        }
        
        return answer;
    }
}