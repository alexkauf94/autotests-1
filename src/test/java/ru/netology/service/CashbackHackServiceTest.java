import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void remainShouldCalculatedAmountZeroAmount() {
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void remainShouldCalculatedAmountUnderBoundary() {
        int amount = 9999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void remainShouldCalculatedAmountOverBoundary() {
        int amount = 10001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
}