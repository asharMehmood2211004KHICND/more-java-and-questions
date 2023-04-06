package arrays;

import java.util.Vector;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);v.add(3);v.add(4);
        removeElement(v,2);

}


    public static  void removeElement(Vector<Integer> nums , int val){
           for(int i = 0; i<nums.toArray().length;i++){
               int num  = nums.get(i);
               if(num==val){
                   nums.removeElement(i);
               }
               //System.out.println(nums.get(i));
           }
        System.out.println(nums);

    }



    }
