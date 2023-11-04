class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String ret = "";
        
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) - '0' == 1) {
                mode = mode == 0 ? 1 : 0;
            } else {
                if (mode == 0) {
                    if (i % 2 == 0) {
                        ret += Character.toString(code.charAt(i));
                    }
                } else if (mode == 1) {
                    if (i % 2 == 1) {
                        ret += Character.toString(code.charAt(i));
                    }
                }
            }
        }
        
        if (ret == "") {
            ret = "EMPTY";
        }
        
        return answer = ret;
    }
}