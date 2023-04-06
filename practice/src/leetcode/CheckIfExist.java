package leetcode;

public class CheckIfExist {

    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr) {
        boolean condition=false;
        int check;
        for(int i=0;i<arr.length;i++){
            check = arr[i];
            for(int j =i+1; j<arr.length;j++){



                if(arr[j]==check*2 & i!=j){

                    condition=true;
                    System.out.println("caught true");


                }

            }
        }
        return condition;
    }

}
