import java.util.*;
public class Java_Functions{
    //function---WITHOUT Parameters
    // public static void calculatesum(){
    //     Scanner sc= new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = a+b;
    //     System.out.println("sum is:"+sum);
    // }

    //with parameters
//      public static int multiply(int a,int b){
//      int product = a*b;
//      System.out.println("product is:"+product);
//      return 0;

//  }


// factorial function
// public static int factorial(int n){
    
//     int fact=1;
//     for(int i = 1;i<=n;i++){
//         fact=fact*i;

//     }
//     System.out.println(fact);
//     return 0;

// }

// Binomial Coefficient Funtion------ n!/r!*(n-r)!

// public static int bincoeff(int n,int r){
//     int nfact = factorial(n);
//     int rfact = factorial(r);
//     int x = n-r;
//     int nmrfact = factorial(x);

//     int binomialcoefficient = nfact/(rfact*nmrfact) ;
//     return binomialcoefficient;
// }

// FUntion Overloading

// public static int sum(int a,int b){
//     int sum = a+b;
//     return sum;
// }
// public static int sum(int a,int b,int c){
//     int sum = a+b+c;
//     return sum;
// }


// public static void main(String args[]){
//     System.out.println(sum(5,2));
//     System.out.println(sum(5,2,3));

// function for prime number
Scanner sc = new Scanner(System.in);
// public static void isprime(int n){
    
//     if(n==2){
//         System.out.println("prime");

//     }
//     for(int i=2;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//             System.out.println("not prime");
//         }
//         else{
//             System.out.println("prime");

//         }
//     }
    
// }

//Binary to decimal
// public static int bintodec(int n){
//     int power=0;
//     int dec=0;
//     while(n!=0){
//         int lastdigit = n%10;
//         dec = dec+(lastdigit*(int)Math.pow(2,power));
//         power++;
//         n=n/10;
//     }
//     System.out.println(dec);
//     return 0;

// }

// function for average
// public static int average(int a,int b,int c){
//     int avg = (a+b+c)/3 ;
//     System.out.println(avg);
//     return 0;
// }

// even -- true odd-false fumction
// public static boolean isEven(int n){
//     boolean x =true;
//     if(n%2==0){
//         System.out.println(x);
//     }
//     else{
//         x=false;
//         System.out.println(x);
        

//     }
//     return x;
// }

// Pallindrome or not
// public static boolean Pallindrome(int n){
//     int reverse=0;
//     int num=n;
//     while(num!=0){
//         int remainder = n%10;
//         reverse=reverse*10+remainder;
//         num=num/10;

//     }
//     if(num==reverse){
//         boolean x = true;
//         System.out.println(x);
        
//     }
    
//     else{
//         boolean x = false;
//         System.out.println(x);

//     }
//     return true;
        
    
    
// }
//sum of digits in a number
// public static int sumofdigit(int num){
//     int sum=0;
//     int lastdigit;
//     while(num!=0){
//         lastdigit=num%10;
//         sum+=lastdigit;
//         num=num/10;
        
//     }
//     System.out.println(sum);
//     return 0;
// }

///////////////////// PATTERN PROBLEMS //////////////

// public static void hollow_rectangle(int rows,int cols){
//     for(int i=1;i<=rows;i++){
//         for(int j =1;j<=cols;j++){
//             if(i==1 || i==rows || j==1 || j== cols){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");

//             }
//         }
//      System.out.println();    
//     }
   


// }

// Inverted half pyramid pattern with numbers
// public static void pyramid(int n){
//     for(int i =1;i<=n;i++){
//         for(int j = 1;j<=n-i+1;j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();

//     }
// }

// Floyd's Triangle
// public static void Floyd(int n){
//     int counter=1;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(counter+" ");
//             counter++;
//         }
//         System.out.println();
//     }
// }

// 1-0 triangle
// public static void tri(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             if((i+j)%2==0){
//                 System.out.print("1");
//             }
//             else{
//                 System.out.print("0");
//             }
//         }
//         System.out.println();
//     }
// }

// Butterfly pattern

// public static void Butterfly(int n){
//     // 1st half
//     for(int i=1;i<=n;i++){

//         // stars - i
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }

//         // spaces - 2*(n-i)
//         for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         // stars - i
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();


//     }
//     //2nd half
//     for(int i=n;i>=1;i--){
//         // stars - i
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }

//         // spaces - 2*(n-i)
//         for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         // stars - i
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();

//     }

// }
// solid rhombus

public static void solid_rhombus(int n){
    for(int i=1;i<=n;i++){
        // spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        System.out.println();

    }
}

public static void main(String args[]){
    solid_rhombus(10);

    
    
    

    



    

        

        
        

        
    }
}