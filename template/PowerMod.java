public class PowerMod {

    static long power(long base, long exp, long mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;

            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}