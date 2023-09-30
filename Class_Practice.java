import java.util.*;
public class Class_Practice{
    public static boolean isPrime(int n){
        if(n == 0 || n==1){
            return false;

        }
        for(int i=2;i<=n/2;i++){
            if(n%i == 0){
                return false;

            }
        }
        return true;
    }
    public static int sumofdigits(int num){
        int sum=0;
        int temp = num;
        while(temp>0){
            int x = temp%10;
            sum += x;
            temp = temp/10;

        }
        return sum;
    }

    public static void primeInRange(int start,int end){
        // int arr[] = new int[100];
        for(int i=start;i<end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
             }
            }
        System.out.println();    
         for(int i=start;i<end;i++){
            if(isPrime(i)){
                int y = sumofdigits(i);
                if(isPrime(y)){
                    System.out.println(i+"->"+y+" ");
                }
                else{
                    System.out.println(i+"->"+"not prime");
                }

            }
            
         }   
    }

    public static void main(String args[]){
        int start = 11;
        int end = 99;
        primeInRange(start, end);
        // System.out.println(sumofdigits(end));
        

        

    }
}