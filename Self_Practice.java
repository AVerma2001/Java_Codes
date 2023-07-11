import java.util.*;
public class Self_Practice{
    public static void greaterelement(int arr[]){
        Stack<Integer> s = new Stack<>();
        int nxt[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=s.peek()){
                s.pop();

            }
            if(s.isEmpty()){
                nxt[i]=-1;

            }
            else{
                nxt[i] = s.peek();
            }
            s.push(arr[i]);

        }
        for(int i =0;i<nxt.length;i++){
            System.out.print(nxt[i]+" ");
        }
    }


    public static void main(String args[]){
        int arr[] = {6,2,1,8,3};
        greaterelement(arr);
    }
    
    

}