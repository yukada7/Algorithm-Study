class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int length = 0;
        
        for (int i = 0; i < finished.length; i++) {
            if (true != finished[i]) length++;
        }

        String[] answer = new String[length];
        
        int cnt = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (true != finished[i]) {
                answer[cnt] = todo_list[i];
                cnt++;
            }
        }
        
        return answer;
    }
}