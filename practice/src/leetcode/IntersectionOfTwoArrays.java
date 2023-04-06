package leetcode;


//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]

//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [9,4]
//        Explanation: [4,9] is also accepted.

import java.util.Arrays;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] a ={1,2,3};
        int[] b ={1,2,3};
        System.out.println(Arrays.toString(intersection(a,b)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {

        int[] intersection = {nums1.length};

        for(int i=0;i<nums1.length;i++){

            //intersection[0] = nums1[i];

        }

        return intersection;
    }


}
