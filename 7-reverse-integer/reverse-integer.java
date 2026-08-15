class Solution {
    public int reverse(int x) {
        long w = 0;

        for (; x != 0;) {
            long j = x % 10;
            w = w * 10 + j;
            x = x / 10;
        }

        if (w > Integer.MAX_VALUE || w < Integer.MIN_VALUE) {
            return 0;}

        return (int) w;
    }
}
