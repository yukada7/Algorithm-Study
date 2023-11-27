class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            String a = Character.toString(s.charAt(i));
            
            if (i == 0) {
                answer[i] = -1;
            } else if (i != 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (s.charAt(i) == s.charAt(j)) {
                        answer[i] = i - j;
                        break;
                    }
                }
                
                if (answer[i] == 0) {
                    answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}