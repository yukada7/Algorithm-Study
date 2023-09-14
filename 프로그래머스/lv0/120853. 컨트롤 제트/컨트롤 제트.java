class Solution {
    public int solution(String s) {
        String[] sArray = s.split(" ");
        int answer = 0;
        
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i].equals("Z")) {
                answer -= Integer.parseInt(sArray[i - 1]);
                continue;
            }
            answer += Integer.parseInt(sArray[i]);
        }

        return answer;
    }
}