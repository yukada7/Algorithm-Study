class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-z]", "").replaceAll("[A-Z]", "");
        String[] arr = my_string.split("");

        for (int i = 0; i < arr.length; i++) {
			answer += Integer.valueOf(arr[i]); 
		}
        
        return answer;
    }
}