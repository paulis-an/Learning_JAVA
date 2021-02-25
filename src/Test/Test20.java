package Test;

public class Test20 {
    public static void main(String[] args) {


    }

    public int[] frontPiece(int[] nums) {
        int[] a;
        if (nums.length > 1) {
            a = new int[]{nums[1], nums[2]};
        } else {
            a = new int[]{nums[1]};
        }
        return a;
    }
}
