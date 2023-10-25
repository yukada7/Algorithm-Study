import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] beforeAry = new String[before.length()];
        String[] afterAry = new String[after.length()];
        
        for (int i = 0; i < before.length(); i++) {
            beforeAry[i] = Character.toString(before.charAt(i));
            afterAry[i] = Character.toString(after.charAt(i));
        }
        
        Arrays.sort(beforeAry);
        Arrays.sort(afterAry);
        
        for (int i = 0; i < beforeAry.length; i++) {
            if (!beforeAry[i].equals(afterAry[i])) {
                return answer;
            }
        }
        
        return answer = 1;
    }
}