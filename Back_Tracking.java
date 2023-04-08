import java.util.*;
public class Back_Tracking{
    public static void changeArr(int arr[] , int i , int val){
        //base case
        if(i == arr.length){
            printarr(arr);
            return;
        }

        // recursion
        arr[i] = val;
        changeArr(arr,i+1,val+1);
        //backtracking
        arr[i] = arr[i]-2;

    }

    // finding subsets of a string
    public static void subsets(String str , String ans , int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //yes choice to be included in the subset by character of string
        subsets(str,ans+str.charAt(i),i+1);
        //no choice
        subsets(str,ans,i+1);     

    }

    // Finding the permutations of a string -------- O(n*n!)
    public static void permutations(String str , String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            permutations(newstr , ans+curr);
        }
    }

    //print array
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    /////////////// NQUEENS PROBLEM /////////////////

    // function to check if safe to place queen
    public static boolean isSafe(char board[][] , int row , int col){
        
        //vertically up checking
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonal up left checking
        for(int i=row-1 , j=col-1 ; i>=0 && j>=0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
            
        }
        // diagonal up right checking
        for(int i = row-1 , j = col+1 ; i>=0 && j<board.length ; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;

    }

    public static void nQueens(char board[][] , int row){
        // base case
        if(row == board.length){
            printBoard(board);
            count++; // everytime base case hits ---> means one way is found --> count++
            return;
        }
        // column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board, row+1); // function call recursion to call for next row and place queen there
                board[row][j] = 'x';   // backtracking to remove queen everytime once it has been placed

            }
            



        }
    }

    public static void printBoard(char board[][]){
        System.out.println("------- chess board -------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();

        }
    }
    static int count = 0; // to count the number of ways to solve n queens

    ////////////// GRID WAYS ////////////////////
    public static int gridways(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j == m-1){
            return 1;
        }
        else if(i == n || j == m){
            return 0;
        }
        //recursion
        int w1 = gridways(i+1,j,n,m);
        int w2 = gridways(i,j+1,n,m);
        return w1+w2;
    }
    public static void main(String args[]){
        // int arr[] = new int[5];
        // // changeArr(arr,0,1);
        // // printarr(arr);
        // String str = "abc";
        // // subsets(str,"",0);
        // permutations(str,"");

        // int n=4;
        // char board[][] = new char[n][n];
        // //initialize board
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         board[i][j] = 'x';
        //     }
        // }

        // nQueens(board,0);
        // System.out.println("total ways to solve n queen:" + count);
        int n=3;
        int m=3;
        System.out.println("The number of ways is: "+gridways(0,0,n,m));


    }
}