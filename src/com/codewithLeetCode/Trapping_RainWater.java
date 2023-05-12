package com.codewithLeetCode;

public class Trapping_RainWater {
    public static int trap(int[] height) {
int leftmax = height[0];
int rightmax = height[0];
int ans = 0;
        for(int  i =0; i<height.length; i++)
        {
//            Left max
            int sileft = i;
            while(sileft>0){
                if(height[sileft]>leftmax)
                {
                    leftmax = height[sileft];
                }

                sileft--;
            }


//            Right max
            int siright = i;
            while(siright<height.length-1){
                if(height[siright]>rightmax)
                {
                    rightmax = height[siright];
                }
                siright++;
            }

          ans +=  Math.min(Math.abs(height[i]-leftmax), Math.abs(height[i]-rightmax));


        }
        return ans;
    }
    public static void main(String[] args) {
int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
int a  =trap(arr);
        System.out.println(a);
    }
}
