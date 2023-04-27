package finalMaterial.week14_27Apr_thurs;

public class JMLArrays {

    //@requires orig != null;
    //@ensures \result.length == orig.length;
    //@ensures (\forall int k; 0 <= k && k < orig.length; \result[k] == orig[k].length());
    public static int[] getStringLengths(String[] orig) {
       //negation of precondition
        if (orig == null) {
            throw new IllegalArgumentException("parameter should not be null");
        }

        int[] arr = new int[orig.length];

        for (int i = 0; i < orig.length; i++) {
            arr[i] = orig[i].length();
        }

        //assert that all our postconditions happened
        assert arr.length == orig.length : "postcondition failed: returned array length should match param";
        for (int i = 0; i < arr.length; i++) {
            assert arr[i] == orig[i].length() : "Postcondition failed: array locations should match length";
        }

        return arr;
    }

    //@requires nums != null;
    //@requires nums.length != 0;
    //@ensures (\forall int k; 0 <= k && k < nums.length; \result <= nums[k]);
    //@ensures (\exists int k; 0 <= k && k < nums.length; \result == nums[k]);
    public static int min(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("array must be nonnull and nonempty");
        }

        int small = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (small < nums[i]) {
                small = nums[i];
            }
        }

        //check postconditions
        for (int i = 0; i < nums.length; i++) {
            assert small <= nums[i] : "postcondition failed: should be <= each element";
        }
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            flag = flag || (nums[i] == small);
        }
        assert flag == true: "postcondition failed: doesn't match array element";

        return small;
    }
}
