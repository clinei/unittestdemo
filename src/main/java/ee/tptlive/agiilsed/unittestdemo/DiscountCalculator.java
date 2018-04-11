package ee.tptlive.agiilsed.unittestdemo;

public class DiscountCalculator {
    public static final double TICKET_PRICE = 100;

    public enum PersonStatus {
        DEFAULT, STUDENT, DISABLED, VIP
    }

    public double calculateDiscount(int age, PersonStatus status) {

        if (age <= 6 || status == PersonStatus.VIP) {

            return 1;
        }


        if (age < 18) {

            return 0.75;
        }

        if (age >= 18 && age <= 26 && status == PersonStatus.STUDENT) {

            return 0.5;
        }

        if (age >= 70 || status == PersonStatus.DISABLED) {

            return 0.9;
        }

        return 0;
    }
}
