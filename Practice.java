import java.util.*;
public class Practice{

    public static int Ratfood(int r, int unit, int arr[]){
        if(arr == null){
            return -1;
        }
        int total = r*unit;
        int sum = 0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            count++;
            if(sum>=total){
                
                break;
            }
  



        }
        if(sum<total){
            return 0;
        }  
        return count; 
        
    }
    public static void main(String args[]){
        int r = 7;
        int unit = 2;
        // int n = 8;
        int arr[] = {2,8,3,5,7,4,1,2};

        System.out.println(Ratfood(r, unit, arr));
    }
}