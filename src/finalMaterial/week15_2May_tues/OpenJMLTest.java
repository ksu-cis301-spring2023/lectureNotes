package finalMaterial.week15_2May_tues;

public class OpenJMLTest {

    //@ requires a <= Integer.MAX_VALUE - 1;
    //@ ensures \result == a+1;
    //@ ensures \result <= Integer.MAX_VALUE;
    public static int add(int a) {
        return a + 1;
    }

    //@ requires x <= Integer.MAX_VALUE - 2;
    //@ ensures \result == x + 2;
    public static int addTwo(int x) {
        int temp = add(x);
        return add(temp);
    }

    //@ requires a != null;
    //@ ensures (\forall int k; 0 <= k && k < a.length; a[k] == k);
    public void setToIndex(int[] a) {
        //@ loop_invariant 0 <= i && i <= a.length;
        //@ loop_invariant (\forall int k; 0 <= k && k < i; a[k] == k);
        //@ decreases a.length -i;
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    }

    //@ requires arr != null;
    //@ ensures \forall int k; 0 <= k && k < arr.length-1;arr[k] <= arr[k+1];
    public static void selectionSort(int[] arr) {
        //@ loop_invariant 0 <= i <= arr.length;
        //@ loop_invariant (\forall int x; 0 <= x < i; (\forall int k; x < k < arr.length; arr[x] <= arr[k]));
        //@ decreasing arr.length-i;
        for (int i = 0; i < arr.length; i++) {
            int swapIndex = minIndex(arr, i);

            int temp = arr[swapIndex];
            arr[swapIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // @requires num != null;
    // @requires pos >= 0 && pos < nums.length;
    // @ensures \result >= pos && \result < nums.length;
    // @ensures (\forall int k; k >= pos && k < nums.length; nums[\result] <= nums[k]);
    public static int minIndex(int[] nums, int pos) {

        int index = pos;

        // @loop_invariant pos < i && i <= nums.length;
        // @loop_invariant pos <= index && index <= nums.length;
        // @loop_invariant (\forall int k; k >= pos && k < i; nums[index] <= nums[k]);
        for (int i = index+1; i < nums.length; i++) {
            if (nums[i] < nums[index]) {
                index = i;
            }
        }

        return index;
    }
}
