import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        return answer = LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }
}