

public class longPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen + 1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // ✅ For VS Code testing
    public static void main(String[] args) {
        longPalindromicSubstring obj = new longPalindromicSubstring();
        System.out.println(obj.longestPalindrome("babad")); // bab or aba
        System.out.println(obj.longestPalindrome("cbbd"));  // bb
    }
}
