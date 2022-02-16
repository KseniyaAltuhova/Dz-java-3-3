public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int result1 = (int) service.calculate(1_000_000, 9.99, 12);
        System.out.println("Ежемесячный платеж по кредиту, оформленному на 1 год: " + result1 + " руб.");


        int result2 = (int) service.calculate(1_000_000, 9.99, 24);
        System.out.println("Ежемесячный платеж по кредиту, оформленному  на 2 года: " + result2 + " руб.");


        int result3 = (int) service.calculate(1_000_000, 9.99, 36);
        System.out.println("Ежемесячный платеж по кредиту, оформленному на 3 года: " + result3 + " руб.");
    }
}
