class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] ary = new String[array.length];
        
        for (int i = 0; i < ary.length; i++) {
            ary[i] = Integer.toString(array[i]);
        }
        
        for (String a : ary) {
            for (int i = 0; i < a.length(); i++) {
                if(7 == a.charAt(i) - '0') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}