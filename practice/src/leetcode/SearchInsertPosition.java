package leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] arr  = {1,3,5,6};
        int target = 4;
        int a = searchPosition(arr,target);
        System.out.println(a);
    }

    static int searchPosition(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){

            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start = mid+1;
            }else {
                return mid; // target = arr[mid];
             }


        }
        return start;
    }

}
