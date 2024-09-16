public class MortgageCalculator {
    final static short MIN_PRINCIPAL = 1000;
    final static long MAX_PRINCIPAL = 1_000_000L;

    final static byte MIN_INTEREST_RATE = 1;
    final static byte MAX_INTEREST_RATE = 3;

    final static byte MIN_YEAR = 1;
    final static byte MAX_YEAR = 30;

    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {

    }

    private setPrincipal(int principal) {
        if(principal < MIN_PRINCIPAL && principal > MAX_PRINCIPAL)
            throw IllegalArgumentException("Principal must be between ", MIN_PRINCIPAL, " and ", MAX_PRINCIPAL);
        this.principal = principal;
    }

}