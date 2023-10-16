class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;

        for (String word : dic) {
            int count = 0;
            for (String s : spell) {
                if (word.contains(s)) count++;
            }
            if (count == spell.length) {
                answer++;
                break;
            }
        }
        if (answer == 0) {
            answer = 2;
        }
        
        return answer;
    }
}