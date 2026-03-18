import java.util.Scanner;

public class test283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    private static void moveZeroes(int[] nums) {
        int l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] != 0) {
                swap(l, r, nums);
                l ++;
            }
            r ++;
        }
    }

    private static void swap(int l, int r, int[] nums) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}
