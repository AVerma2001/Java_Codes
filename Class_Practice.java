import java.util.*;
public class Class_Practice{
    public static boolean isPrime(int n){
        if(n == 0 || n==1){
            return false;

        }
        for(int i=2;i<n/2;i++){
            if(n%i == 0){
                return false;

            }
        }
        return true;
    }

    public static boolean CircularPrime(int num){
        int count = 0;
        int temp = num;
        while(temp>0){
            count++;
            temp = temp/10;
        }
        int N = num;
        while(isPrime(N)){
            int rem = N%10;
            int div = N/10;
            N = (int)Math.pow(10,count-1)*rem+div;

            if(N == num){
                return true;
            }
        }
        return false;
        
    }

    public static void main(String args[]){
        int num = 119;
        System.out.println(CircularPrime(num));

        

    }
}