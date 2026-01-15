public class ReverseInteger {
    
}
class Solution {
    public int reverse(int x) {
        long r = 0;
        while (x != 0) {
            r = r * 10 + x % 10;
            x /= 10;
            if (r > 2147483647 || r < -2147483648)
                return 0;
        }
        return (int) r;
    }
}
