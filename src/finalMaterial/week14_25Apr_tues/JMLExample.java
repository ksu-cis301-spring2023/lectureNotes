package finalMaterial.week14_25Apr_tues;

public class JMLExample {
    //@requires x >= 0;
    //@ensures \result == x+1;
    //@ensures \result >= 1;
    public static int plusOne(int x) {
        int ans = x + 1;

        return ans;
    }

    //@requires nums != null;
    //@ensures (\forall int k; 0 <= k && k < nums.length; nums[k] == \old(nums[k]) + 1);
    public static void doubleEach(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;
        }
    }

    //
    public static int mult(int x, int y) {
        int product = 0;
        for (int i = 0; i < y; i++) {
            product += x;
        }

        return product;
    }
}
