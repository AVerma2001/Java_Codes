import java.util.*;
public class Greedy_Algorithms{
    public static void main(String args[]){
        //// Fractional Knapsack Problem /////
        // int val[] = {60,100,120};
        // int weight[] = {10,20,30};
        // int W = 50;
        
        // double ratio[][] =  new double[val.length][2];
        // //0th column-> index 1st column-> ratio
        // for(int i=0;i<val.length;i++){
        //     ratio[i][0] = i;
        //     ratio[i][1] = val[i]/(double)weight[i];

        // }
        // // sort in ascending order
        // Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        // int capacity = W;
        // int finalVal=0;
        // for(int i=ratio.length-1;i>=0;i--){
        //     int idx = (int)ratio[i][0];
        //     if(capacity>=weight[idx]){
        //         // include full item
        //         finalVal += val[idx];
        //         capacity -= weight[idx];
        //     }
        //     else{
        //         // include fractional item
        //         finalVal += (ratio[i][1]*capacity);
        //         capacity = 0;
        //         break;
        //     }
        // }
        // System.out.println("final value is = " + finalVal);

        //// Minimum sum of Absolute difference pairs ////

        // int A[] = {1,2,3};
        // int B[] = {2,1,3};
        // Arrays.sort(A);
        // Arrays.sort(B);

        // int minDiff = 0;
        // for(int i=0;i<A.length;i++){
        //     minDiff += Math.abs(A[i]-B[i]);
        // }
        // System.out.println("minimum absolute difference sum is:" + minDiff);

        ///// Indian Coins Denomination Problem /////
    //     Integer coins[] = {1,2,5,10,20,50,100,500,2000};
    //     Arrays.sort(coins, Comparator.reverseOrder());
    //     int countofCoins = 0;
    //     int amount = 210;
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     for(int i=0;i<coins.length;i++){
    //         if(coins[i]<=amount){
    //             while(coins[i]<=amount){
    //                 countofCoins++;
    //                 ans.add(coins[i]);
    //                 amount -= coins[i];
    //             }
    //         }
    //     }
    //     System.out.println("No. of minimum coins denomination = "+ countofCoins);

    //     for(int i=0;i<ans.size();i++){
    //         System.out.print(ans.get(i)+" ");
    //     }
    //     System.out.println();
        
    ///// Chocola Problem /////
    int n=4;
    int m=6;
    Integer costVer[] = {2,1,3,1,4};
    Integer costHor[] = {4,1,2};
    
    // sorting both arrays in descending order
    Arrays.sort(costVer, Collections.reverseOrder());
    Arrays.sort(costHor, Collections.reverseOrder());

    int h=0; // pointers
    int v=0; // pointers
    int hp =1; // horizontal pieces initially
    int vp = 1; // vertical pieces initially

    int cost =0;
    while(h<costHor.length && v<costVer.length){
        if(costVer[v]<=costHor[h]){ // horizontal cut
            cost += (costHor[h]*vp);
            hp++; // horizontal pieces increases
            h++; // pointer increases
        }
        else{ // vertical cut
            cost += (costVer[v]*hp);
            vp++;
            v++;
        }

        // leftout cuts
        while(h<costHor.length){
            cost += (costHor[h]*vp);
            hp++; // horizontal pieces increases
            h++; // pointer increases

        }
        while(v<costVer.length){
            cost += (costVer[v]*hp);
            vp++;
            v++;

        }

        System.out.println("Min cost of cuts:" + cost);
    }

    }
}