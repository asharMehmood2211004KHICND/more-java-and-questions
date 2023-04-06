package arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int[] a = {3,2,6,5,0,3};
        maxProfit(a);
    }
    public  static  int maxProfit(int[] prices){
        int cheapest = prices[0];
        int profit = 0;
        int cheapIndex=0;

//        for(int i=0;i<prices.length-1;i++){
//            if(prices[i]<cheapest){
//                cheapest=prices[i];
//                cheapIndex=i;
//                //System.out.println(cheapest);
//
//            }
//           // System.out.println(cheapest);
//        }
//        System.out.println(cheapest);
//
//        for(int j=cheapIndex+1;j<prices.length;j++){
//            if(prices[j] - cheapest > profit){
//                profit =  prices[j] - cheapest ;
//            }
//        }
//        //System.out.println(profit);
//        return profit;
//    }
        for(int i=0;i<prices.length-1;i++){

            for(int j=i+1;j<prices.length;j++){
                System.out.println("value of i " + prices[i]);
                System.out.println( "value of j " + prices[j]);
                int check =prices[i]-prices[j];
                if(check>profit){
                    profit=check;
//                    System.out.println("value of i " + prices[i]);
//                    System.out.println( "value of j " + prices[j]);
                }
            }

        }
        System.out.println(profit);
        return profit;
    }
}
