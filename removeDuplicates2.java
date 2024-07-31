public class removeDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int result = 1;
        int n = nums.length;
        for( int i = 1; i < n; i++){
            if(result==1 || nums[result-1]!=nums[i]){
                nums[result++] = nums[i];
            }
        }
        return result;
        }
}
