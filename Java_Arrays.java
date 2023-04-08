import java.util.*;
public class Java_Arrays{


    // public static void update(int marks[]){
    //     for(int i=0;i<marks.length;i++){
    //         marks[i]=marks[i]+1;
    //         System.out.print(marks[i]+" ");
    //     }
    //     System.out.println();

    // }
    
        //print the array
        
        
        // input
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        //output
        // System.out.println("maths:"+marks[0]);
        // System.out.println("chemistry:"+marks[1]);
        // System.out.println("physics:"+marks[2]);
        
        //update
        // marks[2]=marks[2]+20;
        // System.out.println("updated marks physics:"+marks[2]);

        // Length of an array
        // System.out.println("length of array:"+ marks.length);

        ////LINEAR SEARCH
        // public static int linearsearch(int numbers[],int key){
        //     for(int i=0;i<numbers.length;i++){
        //         if(numbers[i]==key){
        //             return i;
        //         }
                
                
        //         }
        //         return -1;
                

                
        //get the largest from array

        //public static int getlargest(int numbers[]){
        //     int largest=Integer.MIN_VALUE; // -infinity -------- Integer.MAX_VALUE -- +infinity
        //     for(int i=0;i<numbers.length;i++){
        //         if(largest<numbers[i]){
        //             largest=numbers[i];
        //         }
        //     }
        //     return largest;
        // }    
        // public static int getsmallest(int numbers[]){
        //     int smallest= Integer.MAX_VALUE;
        //     for(int i=0;i<numbers.length;i++){
        //         if(smallest>numbers[i]){
        //             smallest=numbers[i];
        //         }
        //     }
        //     return smallest;
        // }

        //////// BINARY SEARCH
        // public static int binarysearch(int numbers[],int key){
        //     int start=0;
        //     int end = numbers.length-1;
        //     while(start<=end){
        //         int mid = (start+end)/2;
        //         if(numbers[mid] == key) {
        //             return mid;
        //         }
        //         if(numbers[mid]>key){
        //             end = mid-1;
        //         }
        //         else{
        //             start = mid+1;
        //         }
        //     }
        //     return -1;
        // }
        // public static void reverse(int numbers[]){
        //     int start=0;
        //     int last = numbers.length-1;
        //     while(start<last){
        //         int temp = numbers[last];
        //         numbers[last] = numbers[start];
        //         numbers[start] = temp;

        //         start++;
        //         last--;
                
        //     }
            
        // }

        // pairs in an array

        // public static void pairs(int numbers[]){
        //     int totalpairs=0;
        //     for(int i=0;i<numbers.length;i++){
        //         int curr = numbers[i];
        //         for(int j=i+1;j<numbers.length;j++){
        //             System.out.print("("+curr+","+numbers[j]+")");
        //             totalpairs++;
        //         }
                
        //         System.out.println();
        //     }    
        //     System.out.println("total number of pairs:"+totalpairs);
                

            
            
        // }

        // Printing the subarrays of an array

        // public static void subarrays(int numbers[]){
        //     int total=0;
        //     for(int i=0;i<numbers.length;i++){
        //         int start=i;
                
        //         for(int j=i;j<numbers.length;j++){
        //             int end=j;
        //             for(int k=start;k<=end;k++){
        //                 System.out.print(numbers[k]+" ");
        //             }
        //             total++;

        //             System.out.println();
        //         }
        //         System.out.println();
        //     }
        //     System.out.println("total subarrays:"+total);

        // }
        // public static void maxarray(int numbers[]){
        //     int currsum=0;
        //     int max_value = Integer.MIN_VALUE;
        //     for(int i=0;i<numbers.length;i++){
        //         int start=i;
        //         for(int j=i;j<numbers.length;j++){
        //             int end=j;
        //             currsum=0;
        //             for(int k=start;k<=end;k++){
        //                 currsum+=numbers[k];

        //             }
        //             System.out.println(currsum);
        //             if(currsum>max_value){
        //                 max_value=currsum;
        //             }
                    
        //         }
        //     }
        //     System.out.println("maximum sum is:"+max_value);
        // }

        ///// prefix sum approach for maxsum using subarray
        // public static void maxarray(int numbers[]){
        //     int currsum=0;
        //     int max_value= Integer.MIN_VALUE;
        //     int prefix[] = new int[numbers.length];
        //     prefix[0] = numbers[0];
        //     // calculate prefix array
        //     for(int i=1;i<prefix.length;i++){
        //         prefix[i] = prefix[i-1]+numbers[i];
        //     }
        //     for(int i=0;i<numbers.length;i++){
        //         int start=i;
        //         for(int j=i;j<numbers.length;j++){
        //             int end=j;

        //             currsum=start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
        //             if(max_value<currsum){
        //                 max_value=currsum;

        //             }
        //         }
        //     }
        //     System.out.println("max sum:"+ max_value);
        // }

        ///// Kadanes Algorithm
        // public static void Kadanes(int numbers[]){
        //     int ms = Integer.MIN_VALUE;
        //     int cs=0;
        //     for(int i=0;i<numbers.length;i++){
        //         cs+=numbers[i];
        //         if(cs<0){
        //             cs=0;
        //         }
        //         ms = Math.max(cs,ms);
        //     }
        //     System.out.println("max sum is:"+ms);
        // }

        ///////////////// TRAPPING RAINWATER PROBLEM///////////////////

        // public static int trappedwater(int height[]){
        //     int n = height.length;
        //     // leftmax array
        //     int leftmax[] = new int[n];
        //     leftmax[0] = height[0];
        //     for(int i=1;i<n;i++){
        //         leftmax[i] = Math.max(height[i],leftmax[i-1]);
        //     }
        //     // rightmax array
        //     int rightmax[] = new int[n];
        //     rightmax[n-1] = height[n-1];
        //     for(int i=n-2;i>=0;i--){
        //         rightmax[i] = Math.max(height[i],rightmax[i+1]);
        //     }
        //     int tw=0;
        //     //loop
        //     for(int i=0;i<n;i++){
        //         // waterlevel = min(leftmax,rightmax)
        //         int waterlevel = Math.min(leftmax[i],rightmax[i]);
        //         // tw = waterlevel-height
        //         tw += waterlevel-height[i];

        //     }
            
        //     return tw;
            
        // }
        /////////////// BUY & SELL STOCKS ///////////////
        // public static int stocks(int prices[]){
        //     int buyprice = Integer.MAX_VALUE;
        //     int maxprofit = 0;
        //     for(int i=0;i<prices.length;i++){
        //         if(buyprice<prices[i]){
        //              // profit is earned
        //              int profit = prices[i] - buyprice;  // today's profit
        //              maxprofit = Math.max(maxprofit,profit);


        //         } else{
        //             buyprice = prices[i];
        //         }
        //     }
        //     return maxprofit;
        // }

        //////////// ASSIGNMENT /////////////
        // public static boolean twice_occur(int nums[]){
        //     for(int i=0;i<nums.length;i++){
        //         for(int j=i+1;j<nums.length;j++){
        //             if(nums[i] == nums[j]){
        //                 return true;
                    
        //         } 
                      
        //         }
                
        //     }
        //     return false;
        // }

        // public static void main(String args[]){
        //     int nums[] = {1,2,3,4,5};
        //     System.out.print(twice_occur(nums));

            // int prices[] = {7,1,5,3,6,4};
            // System.out.println("maximum profit is:"+ stocks(prices));

            // int height[] = {4,2,0,6,3,2,5};
            // System.out.println("trapped rainwater is:"+trappedwater(height));

            // int numbers[]={-2,-3,4,-1,-2,1,5,-3};
            // Kadanes(numbers);
            
            
        // int numbers[]={11,12,14,25,66,78,100};
        // int key=2;
        // int index = linearsearch(numbers,key);
        // if(index==-1){
        //     System.out.println("not found!");
        // }
        // else{
        //      System.out.println("found at:"+index);

        // }

                    
            
//         }
// }

///////////////// 2D ARRAYS /////////////

// public static boolean search(int matrix[][], int key){
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             if(matrix[i][j] == key){
//                 System.out.println("found at cell:"+i+","+j);
//                 return true;

//             }
//         }
//         System.out.println();

//     }
//     return false;

// }

// public static void spiral(int matrix[][]){
//     int startrow = 0;
//     int startcol = 0;
//     int endrow = matrix.length-1;
//     int endcol = matrix[0].length-1;

//     while(startrow<=endrow && startcol<=endcol){
//         // top boundary
//         for(int j=startcol;j<=endcol;j++){
//             System.out.print(matrix[startrow][j]+" ");
//         }
//         // rigth boundary
//         for(int i=startrow+1;i<=endrow;i++){
//             System.out.print(matrix[i][endcol]+" ");
//         }
//         // bottom boundary
//         for(int j=endcol-1;j>=startcol;j--){
//             if(startrow == endrow){
//                 break;
//             }
//             System.out.print(matrix[endrow][j]+" ");
//         }
//         // left boundary
//         for(int i=endrow-1;i>=startrow+1;i--){
//             if(startcol == endcol){
//                 break;
//             }
//             System.out.print(matrix[i][startcol]+" ");

//         }

//         startrow++;
//         startcol++;
//         endrow--;
//         endcol--;

        

//     }
//     System.out.println();
// }

/////////////// DIAGONAL SUM IN A MATRIX //////////////////

// public static int diagonalsum(int matrix[][]){  // o(n^2)
//     int sum =0;
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             if(i == j){
//                 sum += matrix[i][j];
//             }
//             else if(i+j == matrix.length-1){
//                 sum += matrix[i][j];

//             }
//         }
//     }
//     return sum;
// }
// public static int diagonalsum(int matrix[][]){  // o(n) ------ OPTIMIZED CODE
//     int sum =0;
//     for(int i=0;i<matrix.length;i++){
//         // primary diagonal
//         sum+= matrix[i][i];
//         // secodnary diagonal
//         if(i!= matrix.length-i-1){
//             sum+= matrix[i][matrix.length-i-1];
//         }
//     }
//     return sum;
// }

////////// STAIRCASE SEARCH - SEARCHING IN SORTED MATRIX ///////////

// public static boolean staircasesearch(int matrix[][] , int key){
//     int row=0;
//     int col = matrix[0].length-1;
//     while(row<matrix.length && col>=0){
//         if(key == matrix[row][col]){
//             System.out.print("key found at:"+"("+row+","+col+")");
//             return true;
//         }
//         else if(key<matrix[row][col]){
//             col--;
//         }
//         else{
//             row++;
//         }
//         }
//         System.out.println("key not found!");
//     return false;
//     } 

// counting the number of times an element comes in the arrays
// public static int counter(int matrix[][], int key){
//     int count = 0;
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             if(key == matrix[i][j]){
//                 count+=1;
                
//             }
//         }
//     }
//     return count;
// }

///// Print out the sum of 2nd row in matrix
// public static int sumofrow(int matrix[][]){
//     int sum=0;
//     for(int j=0;j<matrix[0].length;j++){
//         sum += matrix[1][j];
//     }
//     return sum;
// }

///// Program to find the transpose of a matrix ///////
public static void printarray2d(int matrix[][]){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    
}
public static void transpose(int matrix[][]){
    int row=matrix.length;
    int col = matrix[0].length;
    int transposemat[][] = new int[col][row];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            transposemat[j][i] = matrix[i][j];
        }
    }
    printarray2d(transposemat);
}
    

public static void main(String args[]){

    // int matrix [][] = new int[3][3];
    // int n = matrix.length;
    // int m = matrix[0].length;
    // Scanner sc = new Scanner(System.in);
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         matrix[i][j] = sc.nextInt();
    //     }

    // }

    int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
    transpose(matrix);
    
    // System.out.println(sumofrow(matrix));
    // System.out.println("number of keys are:"+counter(matrix,8));
    // staircasesearch(matrix,13);
    // spiral(matrix);

    // System.out.print(diagonalsum(matrix));


    // printing output
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         System.out.print(matrix[i][j] + " ");
    //     }
    //     System.out.println();

    // }
    // search(matrix,5);
    

}
}    



                
                



        

        
        
        


        




    
