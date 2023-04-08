import java.util.*;
public class Java_Sorting{

    ///////// BUBBLE SORT ////////
    // public static void bubblesort(int arr[]){
    //     for(int turn=0;turn<arr.length-1;turn++){
    //         int swaps = 0;
    //         for(int j=0;j<arr.length-1-turn; j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //                 swaps++;
    //             }
    //             if(swaps ==0){
    //                 break;  /// no need to run the loops - array is already sorted
    //             }
    //         }
    //     }
    // }

    ///// SELECTION SORT ////////
    // public static void selectionsort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int minpos = i;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[minpos]>arr[j]){
    //                 minpos = j;
    //             }
    //         }
    //         //swap
    //         int temp = arr[minpos];
    //         arr[minpos] = arr[i];
    //         arr[i] = temp;

    //     }
    // }

    ///////// INSERTION SORT //////////////
    // public static void insertionsort(int arr[]){
    //     for(int i=1;i<arr.length;i++){
    //         int curr = arr[i];
    //         int prev = i-1;
    //         // finding the current position to insert
    //         while(prev>=0 && arr[prev] > curr){
    //             arr[prev+1] = arr[prev];
    //             prev--;
    //         }
    //         // insertion
    //         arr[prev+1] = curr;
    //     }
    // }

    //////// COUNTING SORT ///////////////
    // public static void countsort(int arr[]){
    //     int largest = Integer.MIN_VALUE;
    //     for(int i = 0;i<arr.length;i++){
    //         largest = Math.max(largest,arr[i]);
    //     }

    //     int count[] = new int[largest+1];
    //     for(int i = 0;i<arr.length;i++){
    //         count[arr[i]]++;
    //     }

    //     // sorting
    //     int j = 0;
    //     for(int i = 0; i<count.length;i++){
    //         while(count[i]>0){
    //             arr[j] = i;
    //             j++;
    //             count[i]--; 
    //         }
    //     }
    // }


    // ////print array function////
    // public static void printarr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }





    public static void main(String args[]){
        int arr[] = {1,4,1,3,2,4,3,7};
        // bubblesort(arr);
        // selectionsort(arr);
        // insertionsort(arr);
        // Arrays.sort(arr,Collections.reverseOrder());
        // countsort(arr);
        printarr(arr);


    }
}
