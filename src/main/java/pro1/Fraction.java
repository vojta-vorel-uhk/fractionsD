package pro1;

public class Fraction
{
    private long n; // Čitatel
    private long d; // Jmenovatel

    public Fraction(long n, long d) {
        long g = Utils.gcd(n,d);
        this.n = n / g;
        this.d = d / g;
    }

}