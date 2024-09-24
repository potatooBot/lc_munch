import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> dict = new HashSet<>();
        for (String word : dictionary) {
            dict.add(word);
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = (int)1e9;
        }
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                 //System.out.println(sub+" "+j+" "+i);
                if (dict.contains(sub)) {
                  //  System.out.println(sub+" "+j+" "+i);
                    // System.out.println(Arrays.toString(dp));
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
            dp[i] = Math.min(dp[i], dp[i - 1] + 1);
        }
                   // System.out.println(Arrays.toString(dp));

        return dp[n];
    }
}