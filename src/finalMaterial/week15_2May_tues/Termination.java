package finalMaterial.week15_2May_tues;

public class Termination {

    //@ requires y >= 0;
    //@ ensures \result == x*y;
    public static int mult(int x, int y) {
        int sum = 0;
        int count = 0;

        //@ loop_invariant sum == x*count;
        while (count != y) {
            sum = sum + x;
            count = count + 1;
        }

        return sum;
    }

    //@requires y >= 0;
    //@ensures \result == x*y;
    public static int multRec(int x, int y) {
        //what happens here if we don't enforce our precondition?

        if (y == 0) {
            return 0;
        }
        else {
            return x + multRec(x, y-1);
        }
    }

    /*
    How to show termination with recursive method?
     */

    //@requires n > 0;
    //@ensures \result == 1;
    public static int collatz(int n) {

        int cur = n;
        while (cur > 1) {
            if (cur % 2 == 0) {
                cur = cur / 2;
            }
            else {
                cur = 3 * cur + 1;
            }
        }

        return cur;
    }
}
