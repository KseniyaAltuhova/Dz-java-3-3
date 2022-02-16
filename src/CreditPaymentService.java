public class CreditPaymentService {
    public double calculate(double sum, double rateyear, int nmonth) {
        double mrate = rateyear / 100 / 12;
        double summonth = sum * ( mrate + (mrate / (Math.pow(1 + mrate, nmonth) - 1)));

        return summonth;
    }
}
