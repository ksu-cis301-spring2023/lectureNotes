package finalMaterial.week15_2May_tues;

public class Termination {

    //@ requires y >= 0;
    //@ ensures \result == x*y;
    public static int mult(int x, int y) {
        int sum = 0;
        int count = 0;

        //measure of work: y-count iterations

        //@ loop_invariant sum == x*count;
        //@ loop_invariant count <= y;
        while (count != y) {
            int measure1 = y-count;

            sum = sum + x;
            count = count + 1;

            int measure2 = y-count;

            assert measure2 < measure1 : "less work to do with each iteration";

            //when I have no work left, then my loop will be done
            //!work -> done
            //measure2 == 0 -> count == y

            //work V done
            assert measure2 != 0 || count == y : "I either have more work, or my loop will end";
        }

        return sum;
    }

    //@requires y >= 0;
    //@ensures \result == x*y;
    public static int multRec(int x, int y) {
        //what happens here if we don't enforce our precondition?
        if (y < 0) {
            throw new IllegalArgumentException("second parameter should be nonnegative");
        }

        if (y == 0) {
            return 0;
        }
        else {
            return x + multRec(x, y-1);
        }
    }

    /*
    How to show termination with recursive method? Use induction.
    Base case: y = 0. Goes into if, returns and terminates.

    Inductive step: assume that multRec(x, y) terminates for some
    nonnegative integer y. We need to show that multRec(x, y+1)
    also terminates. y+1 will be at least 1, so will go into the else.
    It makes the recursive call multRec(x, y+1-1) which really
    multRec(x, y). We assumed multRec(x,y) terminated, so
    that means multRec(x, y+1) also terminates.

     */

    //@requires n > 0;
    //@ensures \result == 1;
    public static int collatz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("parameter should be positive");
        }

        //cur = 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 ->2 -> 1

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
