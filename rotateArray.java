public class rotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int [] temp = new int[n];
        for(int i = 0; i<n; i++){
            temp[i] = nums[i];
        }
        for(int i = 0; i<n; i++){
            nums[(i+k)%n] = temp[i];
        }
    }

}
