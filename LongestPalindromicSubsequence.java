
public class LongestPalindromicSubsequence {
	  public static String maxPalindrome(String p) {
	    int n = p.length();
	    char[] s = p.toCharArray();
	    int[][] dp = new int[n + 1][n + 1];

	    for (int i = 0; i <= n; i++) {
	      dp[i][0] = dp[0][i] = i;
	    }

	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n - 1 - i; j++) {
	        dp[i + 1][j + 1] = (s[i] == s[n - 1 - j]) ? dp[i][j] : Math.min(dp[i][j + 1] + 1, dp[i + 1][j] + 1);
	      }
	    }

	    int min = n;
	    int x = 0;
	    int y = n;
	    for (int i = 0; i <= n; i++) {
	      if (min > dp[i][n - i]) {
	        min = dp[i][n - i];
	        x = i;
	        y = n - i;
	      }
	    }

	    String middle = "";
	    for (int i = 0; i < n; i++) {
	      if (min > dp[i][n - i - 1]) {
	        min = dp[i][n - i - 1];
	        x = i;
	        y = n - i - 1;
	        middle = "" + s[i];
	      }
	    }

	    StringBuilder res = new StringBuilder();

	    while (x > 0 && y > 0) {
	      int a = dp[x - 1][y - 1];
	      int b = dp[x - 1][y];
	      int c = dp[x][y - 1];
	      int m = Math.min(a, Math.min(b, c));
	      if (m == a) {
	        res.append(s[x - 1]);
	        --x;
	        --y;
	      } else if (m == b) {
	        --x;
	      } else {
	        --y;
	      }
	    }

	    return res.reverse() + middle + res;
	  }

	  // Usage example
	  public static void main(String[] args) {
	    String res = maxPalindrome("3213255552");
	    System.out.println(res);
	  }
	}