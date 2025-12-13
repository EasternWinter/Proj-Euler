public class Euler97_1 {
    public static long sol() {
        long j = (long) (28433 * Math.pow(2, 7830457) + 1);
        return j % (long) Math.pow(10, 10);
    }
}