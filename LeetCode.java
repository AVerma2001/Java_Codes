import java.util.*;
public class LeetCode{
    public static Integer[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<asteroids.length;i++){
            s.push(asteroids[i]);
        }
        int i=0;
        while(i<asteroids.length){
            int x = s.pop();
            int y = s.pop();
            if(x<0 || y<0){
                max = Math.max(Math.abs(x),Math.abs(y));
                max *= -1;
                s.push(max);
                list.add(max);
                i++;


            }
            else{
                s.push(y);
                i++;
                continue;
                
            }
            
            
            
        }
        Integer arr[] = new Integer[list.size()];
        
        return arr;
        
    }

    public static void main(String args[]){
        int asteroids[] = {10,2,-5};
        System.out.println(asteroidCollision(asteroids));
    }
}