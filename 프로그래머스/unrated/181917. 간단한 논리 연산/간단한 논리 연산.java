class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean r1 = false;
        boolean r2 = false;
        boolean r3 = false;
        
        if (x1 == true || x2 == true) r1 = true;
        
        if (x3 == true || x4 == true) r2 = true;
        
        if (r1 == true && r2 == true) r3 = true;
        
        return answer = r3;
    }
}