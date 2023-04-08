import java.util.*;
// boilerplate
public class Java_Basics{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Hello World!");
        //System.out.println("AKASH");

        /*int a = 10;
        int b = 12;
        int sum = a+b;
        System.out.println(sum);
        */

        // Taking Input
       /* System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        
        int sum = n1+n2;
        System.out.println("The sum is:"+sum);
        */

        // Product of two numbers
       /* System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        
        int product = n1*n2;
        System.out.println("The product is:"+product);
        */

        // Area of a Circle
        /*System.out.println("enter radius:");
        float r = sc.nextFloat();
        float area = 3.14f*r*r;
        System.out.println("Area is:"+area);
        */

        
        // Type Casting
        /*float number = 99.99f;
        int num = (int)number;
        System.out.println(num);
        */

        // ASSIGNMENTS
        // Take input and output average
        // System.out.println("Enter first number:");
        // int n1 = sc.nextInt();
        // System.out.println("Enter second number:");
        // int n2 = sc.nextInt();
        // System.out.println("Enter third number:");
        // int n3 = sc.nextInt();

        // int avg = (n1+n2+n3)/3;
        // System.out.println("Average is:"+avg);

        // Area of a square
        // System.out.println("Enter side:");
        // int side = sc.nextInt();
        // double area = side*side;
        // System.out.println(area);

        // Bill preparation with GST
        // System.out.println("Enter cost of pencil:");
        // float c1 = sc.nextFloat();
        // System.out.println("Enter cost of pen:");
        // float c2 = sc.nextFloat();
        // System.out.println("Enter cost of eraser:");
        // float c3 = sc.nextFloat();
        // float sum = c1+c2+c3;
        // double GST = 0.18f*sum;
        // double total = sum+GST ;
        // System.out.println("Total cost is:"+total);

        //swap numbers

        // System.out.println("enter first number:");
        // int n1 = sc.nextInt();
        // System.out.println("enter second number:");
        // int n2 = sc.nextInt();
        // int temp;
        // temp = n1;
        // n1=n2;
        // n2=temp;
        // System.out.println("n1:"+n1);
        // System.out.println("n2:"+n2);

        // leap year or not
        // System.out.println("Enter the year:");
        // int year = sc.nextInt();
        // if(year%4==0) {
        //     if(year%100==0) {
        //         if(year%400==0){
        //             System.out.println("Leap year");
        //         }
        //         else {
        //             System.out.println("Not Leap year");

        //         }
            
        
        //     }
        //     else {
        //         System.out.println("Leap year");
        //     }

        // }
        // else{
        //     System.out.println("Not Leap year");
        // }

        // Factorial of a number'
        // System.out.println("Enter the number:");
        // int num = sc.nextInt();
        // int fact = 1;
        // for(int i = 1 ; i<=num;i++){
        //     fact = fact*i;
        // }
        // System.out.println(fact);

        // Ternary Operator
        // System.out.println("enter a number:");
        // int num = sc.nextInt();
        // String type = ((num%2)==0) ? "even":"odd";
        // System.out.println(type);

        //Calculator
        
        // System.out.println("enter first number:");
        // int a = sc.nextInt();
        // System.out.println("enter second number:");
        // int b = sc.nextInt();
        // char operator = sc.next().charAt(0);

        // switch(operator) {
        //     case '+': System.out.println(a+b);
        //                break;
        //     case '-': System.out.println(a-b);
        //                break; 
        //     case '*': System.out.println(a*b);
        //                break;
        //     case '/': System.out.println(a/b);
        //                break; 
        //     case '%': System.out.println(a%b);
        //                break;
        //     default: System.out.println("Wrong Operator");                                                     
        // }

        //Assignment
        // System.out.println("enter a number:");
        // int num = sc.nextInt();
        // if(num>0){
        //     System.out.println("Positive");
        // }
        // else{
        //      System.out.println("Negative");

        // }

        // System.out.println("enter a temperature:");
        // int temp = sc.nextInt();
        // if(temp>100){
        //     System.out.println("You have fever");

        // }
        // else{
        //     System.out.println("You don't have fever");

        // }
        // System.out.println("enter the day of week:");
        // char day = sc.next().charAt(0);
        // switch(day) {
        //     case '1': System.out.println("Monday");
        //                break;
        //     case '2': System.out.println("Tuesday");
        //                break;
        //     case '3': System.out.println("Wednesday");
        //                break;           
        //     case '4': System.out.println("Thursday");
        //                break;
        //     case '5': System.out.println("Friday");
        //                break;
        //     case '6': System.out.println("Saturday");
        //                break;
        //     case '7': System.out.println("Sunday");
        //                break;
        //     default: System.out.println("None");                                                       
        // }

        // int i = 0;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }

        //sum of N natural numbers
        // System.out.println("enter number:");
        // int num = sc.nextInt();
        // int sum=0;
        // int i = 1;
        // while(i<=num){
        //     sum = sum+i;
        //     i++;

        // }
        // System.out.println("Sum is:"+sum);

        //Reverse a number
        // System.out.println("enter any number:");
        // int num = sc.nextInt();
        // while(num>0){
        //     int lastdigit = num%10;
        //     System.out.print(lastdigit);
        //     num=num/10;
            

        // }
        // System.out.println();

        // continue statement use
        
        // do{
        //     System.out.println("enter a number:");
        //     int n = sc.nextInt();
            
        //     if(n % 10 == 0){
        //         continue;
        //     }
        //     System.out.println(n);
        //  }while(true);

        // prime number or not
        // System.out.println("Enter any number:");
        // int num = sc.nextInt();
        // if(num==2){
        //     System.out.println("prime");
        // }
        // else{
        //     for(int i = 2 ; i<=num-1;i++){
        //     if(num%i==0){
        //         System.out.println("not prime");
        //         break;
        //     }else{
        //         System.out.println("prime");
        //         break;

        //     }
        // }

        // }

        // enter numbers and find sum of odd and even numbers that are entered
        // int num;
        // int choice;
        // int evensum=0;
        // int oddsum=0;
        // do{
        //     System.out.println("enter a number:");
        //     num = sc.nextInt();
        //     if(num%2==0){
        //         evensum = evensum+num;
        //     }else{
        //         oddsum = oddsum+num;
        //     }
        //     System.out.println("do you want to enter more numbers: 1 for yes , 0 for no...enter choice");

        //     choice = sc.nextInt();


        // }while(choice==1);
        // System.out.println("Even sum is:"+evensum);
        // System.out.println("Odd sum is:"+oddsum);
        
        //factorial
        // System.out.println("enter the number:");
        // int num = sc.nextInt();
        // int fact=1;
        // for(int i = 1;i<=num;i++){
        //     fact=fact*i;
        // }
        // System.out.println(fact);

        // Program to print table of a number
        // System.out.println("enter the number:");
        // int num = sc.nextInt();
        // for(int i =1;i<=10;i++){
        //     int product=num*i;
        //     System.out.println(product);

        // }

        // Fibonacci Series upto n terms
        // System.out.println("enter upto where you want the series:");
        // int n = sc.nextInt();
        // int first=0;
        // int second=1;
        // int next;
        // for(int i = 1;i<=n;++i){
        //     System.out.print(first+" ");
        //     next=first+second;
        //     first=second;
        //     second=next;
        // }

        // HCF of two numbers
        // System.out.println("enter first number:");
        // int n1=sc.nextInt();
        // System.out.println("enter second number:");
        // int n2=sc.nextInt();
        // int HCF=1;
        // for(int i =1; i<=n1 && i<=n2; i++){
        //     if(n1%i==0 && n2%i==0){
        //         HCF=i;
        //     }
            
        // }
        // System.out.println("HCF is:"+HCF);


        // Count the number of digits

        // System.out.println("enter the number:");
        // int num = sc.nextInt();
        // int count=0;
        // while(num!=0){
        //     num=num/10;
        //     count+=1;
        // }
        // System.out.println(count);

        // star patterns
        // for(int i = 1;i<=4;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        //inverted star patterns
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        //Number pyramid
        // for(int i = 1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //Number pyramid
        // char c = 'A';
        // for(int i =1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(c);
        //         c++;
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=5;i++){

        //     for(int j=1;j<=4;j++){

        //         if(i==1 || i==5 || j==1 || j==4){

        //             System.out.print("*");
        //         }
        //         else{

                     
                     
        //             System.out.print(" ");

        //          }
        //            System.out.println();
                
            

                
        //      }
            
        //  }
         

        
      
    
        
        









        


        
           
                    
            

        



    
        



        





        

        

        
        
    }
}