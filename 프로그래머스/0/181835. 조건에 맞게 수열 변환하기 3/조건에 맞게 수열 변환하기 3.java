class Solution {
    public int[] solution(int[] arr, int k) {
        int cnt = 0;
        
        if (k % 2 == 0) {
            for (int i : arr) {
                arr[cnt] = i + k;
                cnt++;
            }
        } else {
            for (int i : arr) {
                arr[cnt] = i * k;
                cnt++;
            }
        }
        
        return arr;
    }
}