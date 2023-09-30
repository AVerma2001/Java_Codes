import java.util.*;

//// odd or even program ///////
public class Bit_Manipulation{
    // public static void oddoreven(int n){
    //     int bitmask = 1;
    //     if((n & bitmask) == 0){
    //         // even
    //         System.out.println("even");
    //     }
    //     else{
    //         // odd
    //         System.out.println("odd");
    //     }
    // }

    // /////// Get ith Bit ////////
    // public static int getbit(int n , int i){
    //     int bitmask = 1<<i;
    //     if((n & bitmask) == 0){
    //         return 0;
    //     }
    //     else{
    //         return 1;
    //     }
    // }

    // /////// Set ith Bit to 1 ////////
    // public static int setbit(int n , int i){
    //     int bitmask = 1<<i;
    //     return (n | bitmask);
    // }

    /////// clear ith Bit ////////
    // public static int clearbit(int n , int i){
    //     int bitmask = ~(1<<i);
    //     return (n & bitmask);
    // }

    ////////// Count number of set bits //////////
    public static int countsetbits(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    ////// Check if a number is power of two or not /////
    public static boolean isPowerofTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String args[]){
        System.out.println(countsetbits(15));
        // System.out.println(countsetbits(16));
        // oddoreven(11);
        // oddoreven(12);
        
        
    }
}