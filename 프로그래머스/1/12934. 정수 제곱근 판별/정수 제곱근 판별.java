import static java.lang.Math.sqrt;

class Solution {
    public long solution(long n) {
        double s = sqrt(n);
        if (s == (long) s) {
            long next = (long) s + 1;
            return next * next;
        } else {
            return -1;
        }
    }
}