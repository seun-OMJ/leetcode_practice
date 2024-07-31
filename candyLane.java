import java.util.*;

public class candyLane{ 
    public static int candy(int[] ratings) {
        int result = 0;
        int n = ratings.length;
        int[]candycount = new int[n];
        Arrays.fill(candycount,1);
        
        for(int i = 1; i<n; i++){
        if(ratings[i]> ratings[i-1]){
            candycount[i] = candycount[i-1]+1;
        } }

        for(int i = n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                candycount[i] = Math.max(candycount[i], candycount[i+1]+1);
            }
        }
        for(int i=0; i<n;i++){
            result+=candycount[i];
        } 
        return result;
        }
}
