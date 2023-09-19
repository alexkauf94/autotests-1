package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();
    @org.testng.annotations.Test
    public void remainTest() {
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void remainWithCashback() {
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
}