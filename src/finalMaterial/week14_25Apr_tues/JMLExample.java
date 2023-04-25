package finalMaterial.week14_25Apr_tues;

public class JMLExample {
    //@requires x >= 0;
    //@ensures \result == x+1;
    //@ensures \result >= 1;
    public static int plusOne(int x) {
        if (x < 0) {
            //precondition not met, throw exception
            throw new IllegalArgumentException("precondition failed: parameters must be nonnegative");
        }

        int ans = x + 1;

        assert ans == x+1 : "postcondition failed: should return parameter plus 1";
        assert ans >= 1 : "postcondition failed: should return something >=1";

        return ans;
    }

    //@requires nums != null;
    //@ensures (\forall int k; 0 <= k && k < nums.length; nums[k] == \old(nums[k]) * 2);
    public static void doubleEach(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;
        }
    }


    public static int mult(int x, int y) {
        int product = 0;
        for (int i = 0; i < y; i++) {
            product += x;
        }

        return product;
    }
}
