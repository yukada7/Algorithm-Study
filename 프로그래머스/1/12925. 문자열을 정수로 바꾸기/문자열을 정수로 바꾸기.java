class Solution {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        
        return answer = Character.toString(s.charAt(0)).equals('-') ? -answer : answer;
    }
}