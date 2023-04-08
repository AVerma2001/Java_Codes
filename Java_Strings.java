import java.util.*;
public class Java_Strings{

    /// Palindrome ///
    // public static boolean Palindrome(String str){
    //     for(int i=0;i<str.length()/2;i++){
    //         if(str.charAt(i) != str.charAt(str.length()-i-1)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    ///////// Shortest Path ///////////
    // public static float shortestpath(String Path){
    //     int x=0;
    //     int y=0;
        
    //     for(int i=0;i<Path.length();i++){
    //         char dir = Path.charAt(i);
    //         // north
    //         if(dir == 'N'){
    //             y++;
    //         }
    //         // south
    //         else if(dir == 'S'){
    //             y--;
    //         }
    //         // west
    //         else if(dir == 'W'){
    //             y++;
    //         }
    //         // east
    //         else{

    //             y++;
    //         }
    //     }
    //     int X2 = x*x;
    //     int Y2 = y*y;
    //     return (float)Math.sqrt(X2+Y2);
    // }

    //// Printing Substring //////
    // public static String Substring(String str , int si , int ei ){
    //     String substring = "";
    //     for(int i=si;i<ei;i++){
    //         substring += str.charAt(i);
    //     }
    //     return substring;
    // }

    /////// Convert FIrst letter to uppercase ///////
    // public static String toUppercase(String str){
    //     StringBuilder sb = new StringBuilder("");
    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);
    //     for(int i =1; i<str.length();i++){
    //         if(str.charAt(i) == ' ' && i<str.length()-1){
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         }
    //         else{
    //             sb.append(str.charAt(i));
    //         }
    //     }
    //     return sb.toString();

    // }

    //////////// STRING COMPRESSION //////////////// ---- aaabbcccd = a3b2c3d
    // public static String compress(String str){
    //     String newstr = "";
    //     for(int i=0;i<str.length();i++){
    //         Integer count =1;
    //         while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
    //             count++;
    //             i++;

    //         }
    //         newstr += str.charAt(i);
    //         if(count>1){
    //             newstr += count.toString();
    //         }
    //     }
    //     return newstr;
    // }
    public static void main(String args[]){
        // String str = "HI eVERYONE how are you";
        // System.out.print(toUppercase(str));
        // String str  = "aaabbccddd";
        // System.out.print(compress(str));


        Scanner sc = new Scanner(System.in);

        String str1 = "earth";
        String str2 = "heart";
        // COnverting both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // checking if the length is same of both strings
        if(str1.length() == str2.length()){
            // converts string into character array
            char[] str1array = str1.toCharArray();
            char[] str2array = str2.toCharArray();
            // sort the char array
            Arrays.sort(str1array);
            Arrays.sort(str2array);
            
            boolean result = Arrays.equals(str1array , str2array);
            if(result){
                System.out.println("anargams");
            }
            else{
                System.out.println("not anargams");
            }
        

        } else{
            System.out.println("not anargams");
        }    
        //// Number of vowels in a word input by user ////////////
        // String str = sc.next();
        // int count = 0;
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
        //         count ++;
        //     }

        // }
        // System.out.println("no. of vowels are:" + count);
        //// STRING BUILDER //////
        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'a' ; ch<='z' ; ch++){
        //     sb.append(ch);  // function of string builder to add string 

        // }
        // System.out.println(sb.length());
        
        
        /// Comparing Strings /////
        // String fruits[] = {"apple" , "mango" , "banana"};
        // String largest = fruits[0];
        // for(int i=0;i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest = fruits[i];
        //     }
            
        // }
        // System.out.println(largest);
        // String str = "akashverma";
        // System.out.print(str.substring(0,6));
        // String s1 = "akash";
        // String s2 = new String("akas");
        // if(s1.equals(s2)) { // comparing strings for equality
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }
        // String path = "WNEENESENNN";
        // System.out.print(shortestpath(path));
        // String name = sc.next(); // only one word is printed
        // String name1 = sc.nextLine(); // complete line is printed
        // System.out.println(name1); // to calculate the length
        // Concatination
        // String name1 = sc.nextLine(); // complete line is printed
        // System.out.println(Palindrome(name1));
        // System.out.println(name1);
        // String name2 = sc.nextLine(); // complete line is printed
        // System.out.println(name2);
        // String fullname = name1 + " " + name2 ;
        // System.out.println(fullname.charAt(8));



    }
    
}