

public class MOTA{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        int length_1 = nums1.length;
        int length_2 = nums2.length;
        int [] newArray = new int[length_1+length_2];
        int f_len = newArray.length;
        int num1_counter= 0;
        int count = 0;
        int num2_counter = 0;
        while(count< newArray.length){
            if (num1_counter == length_1 && num2_counter<length_2){
                newArray[count] = nums2[num2_counter];
                num2_counter++;
                count++;
            }
            else if (num2_counter == length_2 && num1_counter<length_1){
                newArray[count] = nums1[num1_counter];
                num1_counter++;
                count++;
            }
            else if(nums1[num1_counter] <= nums2[num2_counter]){
                newArray[count] = nums1[num1_counter];
                num1_counter++;
                count++;
            }
            else if(nums1[num1_counter]> nums2[num2_counter]){
                newArray[count] = nums2[num2_counter];
                num2_counter++;
                count++;
            }
            
        }
        if(f_len % 2 == 0){
            result = (double)(newArray[(f_len/2)-1] + newArray[(f_len/2)])/2;
        }
        else if(f_len % 2 == 1){
            result = newArray[(int)(f_len/2)];
        }
        return result;
    }
}

