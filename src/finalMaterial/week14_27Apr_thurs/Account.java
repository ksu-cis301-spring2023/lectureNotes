package finalMaterial.week14_27Apr_thurs;

public class Account {
    private int _balance;
    private boolean _elite;

    //write global invariants
    //@public invariant getBalance() >= 0;
    //@public invariant isElite() == (getBalance() >= 1000000);

    public Account() {
        _balance = 0;
        _elite = false;

        checkGlobals();
    }

    private void checkGlobals() {
        assert getBalance() >= 0 : "invariant violated: balance should be nonnegative";
        assert isElite() == (getBalance() >= 1000000): "invariant violated: elite should be when >= 1000000m";
    }

    //@requires amount <= getBalance();
    //@ensures getBalance() == \old(getBalance()) - amount;
    public void withdrawal(int amount) {
        checkGlobals();

        if (amount > getBalance()) {
            throw new IllegalArgumentException("Precondition not met: insufficient funds");
        }

        int oldBalance = getBalance();

        _balance -= amount;
        if (getBalance() < 1000000) {
            _elite = false;
        }

        checkGlobals();
        //check your postcondition
        assert getBalance() == oldBalance - amount : "Postcondition failed: balance should be updated";
    }

    //write withdrawal and deposit methods + specifications
    //write globalAsserts method

    //@requires amount >= 0;
    //@ensures getBalance() == \old(getBalance()) + amount;
    public void deposit(int amount) {
        checkGlobals();

        if (amount < 0) {
            throw new IllegalArgumentException("Precondition not met: insufficient funds");
        }

        int oldBalance = getBalance();

        _balance += amount;
        if (getBalance() >= 1000000) {
            _elite = true;
        }

        checkGlobals();
        //check your postcondition
        assert getBalance() == oldBalance + amount : "Postcondition failed: balance should be updated";
    }

    public int getBalance() {
        return _balance;
    }

    public boolean isElite() {
        return _elite;
    }
}
