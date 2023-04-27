package finalMaterial.week14_27Apr_thurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void withdrawal() {
        Account a = new Account();
        a.deposit(5000000);
    }
}