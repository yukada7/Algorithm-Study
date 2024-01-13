class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int startCnt = 0;
        int endCnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                startCnt++;
            } else if (s.charAt(i) == ')') {
                endCnt++;
            }
            
            if (startCnt < endCnt) {
                return false;
            }
        }

        return answer = startCnt == endCnt ? true : false;
    }
}