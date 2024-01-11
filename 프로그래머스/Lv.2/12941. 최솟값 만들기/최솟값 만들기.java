import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);

        int cnt = B.length - 1;
        
        for (int i = 0; i < A.length; i++) {
            for (int j = cnt; j >= 0;) {
                answer += A[i] * B[j];
                cnt--;
                break;
            }
        }
        
        return answer;
    }
}