package ee.tptlive.agiilsed.unittestdemo;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountCalculatorTest {

    // Status: DEFAULT

    @Test
    public void calculateDiscount_Returns1_IfAge0AndStatusDefault() {

        // given
        int age = 0;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge3AndStatusDefault() {

        // given
        int age = 3;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge6AndStatusDefault() {

        // given
        int age = 6;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point75_IfAgeLessThanOrEqual6AndStatusDefault() {

        // given
        int age = 7;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.75, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point75_IfAgeBetween6And18AndStatusDefault() {

        // given
        int age = 14;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.75, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point75_IfAgeLessThan18AndStatusDefault() {

        // given
        int age = 17;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.75, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0_IfAge18AndStatusDefault() {

        // given
        int age = 18;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0_IfAgeBetween18And27AndStatusDefault() {

        // given
        int age = 24;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0_IfAge26AndStatusDefault() {

        // given
        int age = 26;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0_IfAge27AndStatusDefault() {

        // given
        int age = 27;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0_IfAgeBetween27And69AndStatusDefault() {

        // given
        int age = 50;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0_IfAge69AndStatusDefault() {

        // given
        int age = 69;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAge70AndStatusDefault() {

        // given
        int age = 70;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.9, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAgeBetween70AndPlusInfinityAndStatusDefault() {

        // given
        int age = 900;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DEFAULT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.9, result, 0.0001);
    }

    // Status: STUDENT

    @Test
    public void calculateDiscount_Returns1_IfAge0AndStatusStudent() {

        // given
        int age = 0;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge3AndStatusStudent() {

        // given
        int age = 3;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge6AndStatusStudent() {

        // given
        int age = 6;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point75_IfAge7AndStatusStudent() {

        // given
        int age = 7;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.75, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point75_IfAgeBetween6And18AndStatusStudent() {

        // given
        int age = 14;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.75, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point75_IfAge17AndStatusStudent() {

        // given
        int age = 17;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.75, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point50_IfAge18AndStatusStudent() {

        // given
        int age = 18;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.50, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point50_IfAgeBetween18And26AndStatusStudent() {

        // given
        int age = 24;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.50, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point50_IfAge26AndStatusStudent() {

        // given
        int age = 26;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.50, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0_IfAge27AndStatusStudent() {

        // given
        int age = 27;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0_IfAgeBetween27And69AndStatusStudent() {

        // given
        int age = 50;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0_IfAge69AndStatusStudent() {

        // given
        int age = 69;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAge70AndStatusStudent() {

        // given
        int age = 70;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.9, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAgeBetween70AndPlusInfinityAndStatusStudent() {

        // given
        int age = 900;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.STUDENT;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.9, result, 0.0001);
    }

    // Status: DISABLED

    @Test
    public void calculateDiscount_Returns1_IfAge0AndStatusDisabled() {

        // given
        int age = 0;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge3AndStatusDisabled() {

        // given
        int age = 3;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge6AndStatusDisabled() {

        // given
        int age = 6;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAge7AndStatusDisabled() {

        // given
        int age = 7;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.90, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAgeBetween6And18AndStatusDisabled() {

        // given
        int age = 14;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.90, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAge17AndStatusDisabled() {

        // given
        int age = 17;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.90, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAge18AndStatusDisabled() {

        // given
        int age = 18;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.90, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAgeBetween18And26AndStatusDisabled() {

        // given
        int age = 24;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.90, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAge26AndStatusDisabled() {

        // given
        int age = 26;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.90, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAge27AndStatusDisabled() {

        // given
        int age = 27;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.90, result, 0.0001);
    }


    @Test
    public void calculateDiscount_Returns0Point90_IfAgeBetween27And69AndStatusDisabled() {

        // given
        int age = 50;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.90, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAge69AndStatusDisabled() {

        // given
        int age = 69;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.90, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAge70AndStatusDisabled() {

        // given
        int age = 70;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.90, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns0Point90_IfAgeBetween70AndPlusInfinityAndStatusDisabled() {

        // given
        int age = 900;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.DISABLED;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(0.90, result, 0.0001);
    }
    
    // Status: VIP

    @Test
    public void calculateDiscount_Returns1_IfAge0AndStatusVIP() {

        // given
        int age = 0;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge3AndStatusVIP() {

        // given
        int age = 3;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge6AndStatusVIP() {

        // given
        int age = 6;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge7AndStatusVIP() {

        // given
        int age = 7;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAgeBetween6And18AndStatusVIP() {

        // given
        int age = 14;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge17AndStatusVIP() {

        // given
        int age = 17;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge18AndStatusVIP() {

        // given
        int age = 18;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAgeBetween18And26AndStatusVIP() {

        // given
        int age = 24;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge26AndStatusVIP() {

        // given
        int age = 26;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge27AndStatusVIP() {

        // given
        int age = 27;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }


    @Test
    public void calculateDiscount_Returns1_IfAgeBetween27And69AndStatusVIP() {

        // given
        int age = 50;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAge69AndStatusVIP() {

        // given
        int age = 69;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1Point90_IfAge70AndStatusVIP() {

        // given
        int age = 70;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void calculateDiscount_Returns1_IfAgeBetween70AndPlusInfinityAndStatusVIP() {

        // given
        int age = 900;
        DiscountCalculator.PersonStatus status = DiscountCalculator.PersonStatus.VIP;

        // when
        double result = new DiscountCalculator().calculateDiscount(age, status);

        // then
        assertEquals(1, result, 0.0001);
    }
}
