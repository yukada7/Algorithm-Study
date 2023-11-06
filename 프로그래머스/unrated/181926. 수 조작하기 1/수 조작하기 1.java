class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for (char a : control.toCharArray()) {
            switch (a) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
                default:
                    break;
            }
        }
        
        return answer = n;
    }
}