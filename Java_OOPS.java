import java.util.*;
public class Java_OOPS{
    class Complex{
        int real;
        int imag;
        public Complex(int r, int i){
            real = r;
            imag = i;

        }
    public static Complex add(Complex a, Complex b){
        return new  Complex((a.real+b.real),(a.imag+b.imag));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.real)+(a.real*b.real)));
    }
    public void printcomplex(){
        if(real == 0 && imag!=0){
            System.out.println(imag+"j");
        }
        else if(imag == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"j"+imag);
        }
    }
    }
    public static void main(String args[]){
        Complex c = new Complex(4,5);
        Complex d = new Complex(9,4);

        Complex e = Complex.add(c,d);
        Complex f = Complex.diff(c,d);
        Complex g = Complex.product(c,d);

        e.printcomplex();
        f.printcomplex();
        g.printcomplex();

        // Student s1 = new Student("akash");
        // System.out.println(s1.name);
        // Fish tuna = new Fish();
        // tuna.eat();
        // tuna.breathe();
        // tuna.swim();


        // method overloading //  
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum((float)1.5,(float)2.5));
        // System.out.println(calc.sum(1,2,3));

        // Method Overriding //
        //Animal a = new Animal();
        //a.eat();

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();







        // Pen p1 = new Pen();  // created a pen object called p1
        // p1.setcolor("blue");
        // p1.settip(5);
        // System.out.println(p1.color);
        // System.out.println(p1.tip);

        // Bankaccount myacc = new Bankaccount();
        // myacc.username = "akashverma";
        // myacc.setpassword("123456");
    }

}

// class Bankaccount{
//     public String username;
//     private String password;
//     public void setpassword(String pwd){
//         password = pwd;
//     }

// }
// class Pen{
//     String color;
//     int tip;

//     void setcolor(String newcolor){
//         color = newcolor;
//     }

//     void settip(int newtip){
//         tip = newtip;
//     }
// }
// class Student{
//     String name;
//     int roll;
//     Student(String name){
//         this.name = name;
//     }
// }
////////////// INHERITENCE ////////////
// BASE CLASS
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("it eats");
//     }
//     void breathe(){
//         System.out.println("it breathes");
//     }

// }
// // DERIVED CLASS / SUBCLASS
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("it swims");
//     }
// }

/////  Method Overloading /////
// class Calculator{
//     int sum(int a, int b){
//         return a+b;
//     }
//     float sum(float a, float b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c;
//     }
// }

//////// Method Overriding ////////
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("animal eats");
//     }

// }
// class Deer{
//     void eat(){
//         System.out.println("deer eats");
//     }
// }

///// ABSTRACT CLASS //////
// abstract class Animal{
//     void eat(){
//         // non abstract method
//         System.out.println("animal eats");
//     }
//     abstract void walk(); // abstract method
// }
// class Horse extends Animal{
//     void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     void walk(){
//         System.out.println("walks on 2 legs");
//     }
// } 