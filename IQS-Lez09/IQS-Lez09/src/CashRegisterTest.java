import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CashRegisterTest {
    private static final double EPSILON = 1E-12;

    CashRegister cashRegister;

    @Before
    public void setUp() {
        cashRegister = new CashRegister();
    }

    @Test
    public void twoPurchaseTest() {
        cashRegister.recordPurchase(1.75);
        cashRegister.recordPurchase(0.5);
        Assert.assertEquals(2.25, cashRegister.getPurchase(), EPSILON);
    }

    @Test
    public void receivePaymentTest() {
        cashRegister.receivePayment(2, 0, 5, 0, 0);

        Assert.assertEquals(2.5, cashRegister.getPayment(), EPSILON);
    }

}
