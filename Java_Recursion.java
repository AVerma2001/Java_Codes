import java.util.*;
public class Java_Recursion{

    ///// print 10 to 1 using recursion /////
    // public static void printdec(int n){
    //     //base case
    //     if(n==1){
    //         System.out.print(n);
    //         return;
    //     }
    //     System.out.print(n + " "); // work
    //     printdec(n-1); // inner function call
    // }

    //// Print increasing number /////
    // public static void printinc(int n){
    //     //base case
    //     if(n==1){
    //         System.out.print(n + " ");
    //         return;
    //     }
    //     printinc(n-1); // inner function call
    //     System.out.print(n + " "); // work
        
    // }

    ///// Factorial using Recursion /////
    // public static int factorial(int n){
    //     //base case
    //     if(n==0){
    //         return 1;
    //     }
    //     int X = factorial(n-1); // inner function call
    //     int Z = n*X; // work
    //     return Z;
        
    // }

    //// Sum of first n natural numbers ////
    // public static int sum(int n){
    //     //base case
    //     if(n==1){
    //         return 1;
    //     }
    //     int X= sum(n-1); // inner function call
    //     int Y= X+n;     // work
    //     return Y;
    // }

    ///// nth term of Fibonacci Series ///// ------- Space Complexity O(n) Time Complexity(2^n) 
    // public static int fib(int n){ 
    //     // base case
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     int fnm1 = fib(n-1);
    //     int fnm2 = fib(n-2);
    //     int fn = fnm1+fnm2;
    //     return fn;
    // }

    //// Check if an array is sorted or not /////
    // public static boolean issorted(int arr[], int i){
    //     // Base Case
    //     if(i ==  arr.length-1){
    //         return true;
    //     }
    //     if(arr[i]>arr[i+1]){
    //         return false;
    //     }
    //     return issorted(arr,i+1);
    // }

    // /// Find the first occurance of an element in array /////
    // public static int firstocc(int arr[] , int key , int i){
    //     // base case
    //     if(i == arr.length){
    //         return -1;
    //     }
    //     if( arr[i] == key){ // work
    //         return i;
    //     }
    //     return firstocc(arr,key,i+1); // inner function call
    // }

    ///// print x^n ////
    // public static int power(int x , int n){
    //     // base case
    //     if(n == 0){
    //         return 1;
    //     }
    //     return x*power(x,n-1); // work and inner function call
    // }

    ///// Print x^n optimized method ///// -------- O(logn)
    // public static int optimizedpower(int x,int n){
    //     //base case
    //     if(n == 0){
    //         return 1;
    //     }
    //     int halfpower = optimizedpower(x,n/2);
    //     int halfpowersq = halfpower*halfpower;
    //     if(n%2 != 0){
    //         return x*halfpowersq;
    //     }
    //     return halfpowersq;
    // }



    ////// TILING PROBLEM //////
    // public static int tilingproblem(int n){
    //     // base case
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     // work
    //     // vertical choice
    //     int fnm1 = tilingproblem(n-1);
    //     //horizontal choice
    //     int fnm2 = tilingproblem(n-2);
    //     int totways = fnm1+fnm2;
    //     return totways;
    // }

    //// Find the sum of digits of a number /////
    // public static int sumofdigits(int n){
        
    //     // base case 
    //     if(n == 0){
    //         return n;
    //     }
        
    //     int sum = (n%10) + sumofdigits(n/10);
    //     return sum;
    //     }

    //// Decimal to Binary using recrusion ////
    // public static int D2B(int n , int pow){
        
    //     if(n == 0){
    //         return 0;
    //     }
    //     int x = (int)Math.pow(10,pow)*(n%2) + D2B(n/2,pow+1);
    //     return x;
        
    // }

    //// Binary to Decimal using recursion /////
    // public static int B2D(int n , int pow){
        
    //     if(n == 0){
    //         return 0;
    //     }
    //     int x = (int)Math.pow(2,pow)*(n%10) + B2D(n/10,pow+1); 
    //     return x;
        
    // }
    

    /////  Remove duplicates from string /////
    // public static void removeduplicate(String str , StringBuilder newstr , int idx , boolean map[]){
    //     // base case 
    //     if(idx == str.length()){
    //         System.out.println(newstr);
    //         return ;
    //     }
    //     char currchar = str.charAt(idx);
    //     if(map[currchar - 'a'] == true){
    //         removeduplicate(str,newstr,idx+1,map);
    //     } else{
    //         map[currchar-'a'] = true;
    //         removeduplicate(str, newstr.append(currchar), idx+1,map);
    //     }


    // }

    //// table using recursion ////
    // public static void table(int n , int p){
    //     //base case 
    //     if(p==10){
    //         System.out.println(n*p);
    //         return;
            
            
    //     }
    //     // if(p==11){
    //     //     return;
    //     // }
    //     System.out.println(n*p);
    //     table(n,p+1);


    // }

    ///// Friends pairing problem /////
    // public static int friendspairing(int n){
    //     // base case 
    //     if(n==1 | n==2){
    //         return n;
    //     }
    //     // work
    //     // int fnm1 = friendspairing(n-1);  // single
    //     // int fnm2 = friendspairing(n-2);  // pairing
    //     // int pairingtotal = (n-1)*fnm2;

    //     // return fnm1+pairingtotal;

    //     // method 2
    //     return friendspairing(n-1) + (n-1)*friendspairing(n-2);

    // }

    ///// Print Binary String of size n without consecutive 1 /////
    // public static void binarystring(int n, int lastplace , String str){
    //     //base case
    //     if(n==0){
    //         System.out.println(str);
    //         return;
    //     }
    //     //work
    //     binarystring(n-1,0,str+"0");
    //     if(lastplace == 0){
    //         binarystring(n-1,1,str+"1");
    //     }
    // }

    ////// Finding the occurences of an element in an array ////
    // public static void occurences(int arr[] , int key , int idx){
    //     // base case
    //     if(idx == arr.length){
    //         return;
    //     }
    //     if(arr[idx] == key){
    //         System.out.print(idx+" ");
    //     }
        
    //     occurences(arr,key,idx+1);
    // }

    ///// Convert a given number to string form (2019 -- two zero one nine) /////
    // static String Digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    // public static void printdigits(int number){
    //     //base case
    //     if(number == 0){
    //         return;
    //     }
    //     //work
    //     int lastdigit = number%10;
        
    //     System.out.print(Digits[lastdigit] + " ");
    // }

    
    ///// TOWER OF HANOI /////
    // public static void towerofhanoi(int n,String src,String helper,String dest){
    //     //base case
    //     if(n==1){
    //         System.out.println(" transfer disk " + n + " from " + src+ " to " + dest);
    //         return;
    //     }
    //     towerofhanoi(n-1,src,dest,helper);
    //     System.out.println(" transfer disk " + n + " from " + src+ " to " + dest);
    //     towerofhanoi(n-1,helper,src,dest);

    // }

    //// Rverse a String using recursion /////
    // public static void Reverse(String str , int idx){
        
    //     //base case
    //     if(idx==0){
    //         System.out.print(str.charAt(idx));
    //         return;
    //     }
    //     //work
    //     System.out.print(str.charAt(idx));
    //     Reverse(str,idx-1); // inner function call
    // }


    ///// Find the first and last occurance of a character in a string //////
    public static int first = -1;
    public static int last = -1;
    public static void occ(String str , int idx , char element){
        //base case
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        //work
        char currchar = str.charAt(idx);
        if(currchar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        occ(str,idx+1,element);
    
        
    }


    public static void main(String args[]){
        
        String str = "ababcaaavad";
        
        occ(str,0,'a');
        // Reverse(str,str.length()-1);
        
        
        // int n=4;
        // towerofhanoi(n,"S","H","D");
        
        // int arr[] = {3,2,4,5,6,2,7,2,2};
        // occurences(arr,2,0);
        // String str  = "appnnacollege";
        // removeduplicate(str,new StringBuilder(""),0,new boolean[26]);
        // System.out.println(tilingproblem(2));
        // System.out.println(B2D(0101010111,0));
        // System.out.println(friendspairing(3));
        // binarystring(3,0,"");


    }
}