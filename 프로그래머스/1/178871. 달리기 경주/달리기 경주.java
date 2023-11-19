import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> a = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            a.put(players[i], i);
        }
        
        for (String p : callings) {
            int i = a.get(p);
            String b = players[i - 1];
            
            players[i - 1]  = p;
            players[i] = b;
            
            a.put(p, i - 1);
            a.put(b, i);
        }
        
        return players;
    }
}