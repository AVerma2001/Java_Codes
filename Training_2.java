import java.util.*;
public class Training_2{
    public static void Automorphic(int num){
        double sq = num*num;
        String s = Integer.toString(num);
        double size = s.length();
        double x = Math.pow(10, size);
        if(sq%x == num){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not Automorphic Number");
        }
    }

    public static void Trendy(int num){
        if(num<100 && num>999){
            System.out.println("invalid input");
        }
        num = num/10;
        int y = num%10;
        if(y%3 == 0){
            System.out.println("Trendy Number");
        }
        else{
            System.out.println("Not Trendy Number");
        }
    }

    
        
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // // Automorphic(num);
        // Trendy(num);

        int nums[] = {1,2,3,3,4,4,5,5,6};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set);
        System.out.println(set.size());

    }
}