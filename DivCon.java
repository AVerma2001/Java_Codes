import java.util.*;
public class DivCon{

    //Print array function
    public static void printarray(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge sort
    // public static void mergesort(int arr[], int si, int ei){
    //     //base case
    //     if(si>=ei){
    //         return;
    //     }
    //     //work
    //     int mid = si + (ei-si)/2 ;
    //     mergesort(arr,si,mid); // left half of array
    //     mergesort(arr,mid+1,ei); // right half of array
    //     merge(arr,si,mid,ei);
    // }
    // public static void merge(int arr[], int si,int mid, int ei){
    //     int temp[] = new int[ei-si+1];
    //     int i =si; // iterator for left part
    //     int j = mid+1; // iterator for right part
    //     int k = 0; // iterator for temp array

    //     while(i<=mid && j<=ei){
    //         if(arr[i]<arr[j]){
    //             temp[k] = arr[i];
    //             i++;
    //         }
    //         else{
    //             temp[k] = arr[j];
    //             j++;
    //         }
    //         k++;
    //     }

    //     // left part
    //     while(i <= mid){
    //         temp[k++] = arr[i++];
    //     }
    //     //right part
    //     while(j<=ei){
    //         temp[k++] = arr[j++];
    //     }

    //     // copy temp to original array
    //     for(k=0 , i=si; k<temp.length ; k++,i++){
    //         arr[i] = temp[k];
    //     }

    // }

    ///// QUICK SORT ///////
    public static void quicksort(int arr[] , int si, int ei){
        // base case
        if(si>=ei){
            return;
        }
        // last element
        int pidx = partition(arr,si,ei);
        quicksort(arr,si,pidx-1); //  left
        quicksort(arr,pidx+1,ei); //  right

    }
    public static int partition(int arr[] , int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j = si; j<ei ; j++){
            if(arr[j]<= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    ///// Merge sort to an array of strings /////
    public static String[] Mergesort(String arr[], int lo, int hi){
        if(lo==hi){
            String[] A = {arr[lo]};
            return A;
        }
        int mid = lo + (hi-lo)/2;
        String[] arr1 = Mergesort(arr,lo,mid);
        String[] arr2 = Mergesort(arr,mid+1,hi);

        String[] arr3 = merge(arr1,arr2);
        return arr3;
    }

    static String

    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quicksort(arr,0,arr.length-1);
        printarray(arr);
    }



}