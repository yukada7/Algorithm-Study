class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pCnt = 0;
        int yCnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            
            if (a == 'p' || a == 'P') pCnt++;
            else if (a == 'y' || a == 'Y') yCnt++;
        }
        
        return answer = pCnt == yCnt ? true : false;
    }
}