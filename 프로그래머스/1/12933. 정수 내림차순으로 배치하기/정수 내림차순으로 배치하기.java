import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);
 
        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);
 
        return answer = Long.parseLong(sb.reverse().toString());
    }
}