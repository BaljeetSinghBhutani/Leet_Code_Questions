package Contest_Question;

import java.util.Arrays;

public class Rearrange_Array_To_Maximize_Prefix_Score {
    public int maxScore(int[] nums) {

        long sum  = 0;
        int count = 0;

        int prefix[] =  new int [nums.length];
        int k = 0;
        Arrays.sort(nums);

        for(int i = nums.length-1;i>=0;i--)
        {
             sum+=nums[i];
            if(sum>0){
                count++;
            }
            else{
                break;
            }
            k++;
        }
//
//        for(int i  = 0; i<prefix.length; i++)
//        {
//            if(prefix[i]>0)
//            {
//                count++;
//            }
//        }
        return count;

    }
    public static void main(String[] args) {

    }
}
