public class removeDuplicates1 {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        int n = nums.length;
        for( int i = 0; i < n; i++){
            if(result==0 || nums[result-1]!=nums[i]){
                nums[result++] = nums[i];
            }
        }
        return result;
    }
}
