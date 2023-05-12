package Contest_Question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class find_the_distinct_difference_array {
    public int[] distinctDifferenceArray(int[] nums) {

int ans[] = new int[nums.length];
int o = 0;

for(int i =0; i<nums.length; i++)
{
    int k = 0;
    Set<Integer> pref = new HashSet<>();
    Set<Integer> suff = new HashSet<>();


    while (k<=i){
        pref.add(nums[k]);
        k++;
    }
    int l = i+1;

    while (l<nums.length){
        suff.add(nums[l]);
        l++;
    }

    ans[o] =  pref.size() - suff.size();
    o++;

}

return ans;

    }
    public static void main(String[] args) {

    }
}
