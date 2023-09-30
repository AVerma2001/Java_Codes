import java.util.*;
public class Accenture_Practice{
    
    // public static int Autobiographical(String str){
    //     int size = 0;
    //     Integer arr[] = new Integer[10];
    //     boolean flag = false;
    //     HashSet<Character> set = new HashSet<>();
    //     for(int i=0;i<str.length();i++){
    //         set.add(str.charAt(i));
    //     }
    //     Arrays.fill(arr,0);
    //     for(int i=0;i<str.length();i++){
    //         char c = str.charAt(i);
    //         arr[c-'0']++;
    //     }
    //     String res = "";
    //     for(int i=0;i<arr.length;i++){
    //         res += arr[i].toString();
    //     }
    //     res = res.substring(0,str.length());
    //     if(res.equals(str)){
    //         flag = true;
    //     }
    //     if(flag == true){
    //         size = set.size();

    //     }
    //     return size;
        
        

    // }

    // public static int FindCount(int arr[], int n){
    //     HashSet<Integer> set = new HashSet<>();
    //     for(int i=0;i<arr.length;i++){
    //         set.add(arr[i]);
    //     }
    //     return set.size();


    // }
    // public static int DiffOfSum(int n,int m){
    //     int sum1 = 0;
    //     int sum2 = 0;
    //     for(int i=1;i<=n;i++){
    //         if(i%m == 0){
    //             sum1 += i;

    //         }
    //         else{
    //             sum2 += i;
    //         }
    //     }
    //     return sum2-sum1;
    // }
    // public static int LargeSmallSum(int arr[]){
    //     ArrayList<Integer> list1 = new ArrayList<>();
    //     ArrayList<Integer> list2 = new ArrayList<>();
    //     for(int i=0;i<arr.length;i = i+2){
    //         list1.add(arr[i]);
    //     }
    //     for(int i=1;i<arr.length;i = i+2){
    //         list2.add(arr[i]);
    //     }
    //     Collections.sort(list1);
    //     Collections.sort(list2);

    //     return list2.get(1) + list1.get(list1.size()-2);
        

    // }

    // public static boolean isAnagram(String s, String t){
    //     HashMap<Character,Integer> map = new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         char ch = s.charAt(i);
    //         map.put(ch,map.getOrDefault(ch, 0)+1);
    //     }
    //     for(int i=0;i<t.length();i++){
    //         char ch = t.charAt(i);
    //         if(map.get(ch) != null){
    //             if(map.get(ch) == 1){
    //                 map.remove(ch);
    //             }
    //             else{
    //                 map.put(ch,map.get(ch)-1);
    //             }
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    //     return map.isEmpty();


    // }

    // public static void UppLow(String str){
    //     char arr[] = new char[str.length()];
        
    //     // fill the array with letters
    //     for(int i=0;i<str.length();i++){
    //         char ch = str.charAt(i);
    //         arr[i] = ch;
    //     }
        
    //     // boolean flag array
    //     boolean flag[] = new boolean[arr.length];
    //     Arrays.fill(flag,false);

    //     // convert upp to low and low to upp
    //     for(int i=0;i<arr.length;i++){
    //         char c = arr[i];
    //         if(c>=65 && c<=90){
    //             arr[i] = Character.toLowerCase(c);
    //             flag[i] = true;
    //         }
    //         else if(c >= 97 && c<= 120){
    //             arr[i] = Character.toUpperCase(c);
    //         }

    //     }
        
    //     for(int i=0;i<arr.length;i++){
    //         if(flag[i] == true){
    //             System.out.println();
    //         }
    //         System.out.print(arr[i]);
            
    //     }
    //     // System.out.println(count);
    // }

    // public static int SquarePlot(int arr[]){
    //     int count = 0;
    //     for(int i=0;i<arr.length;i++){
    //         double x = (double)Math.sqrt(arr[i]);
    //         double y = x - (double)Math.floor(x);
    //         if(y == 0){
    //             count++;

    //         }

    //     }
    //     return count;

    // }

    // public static void FindMax(int arr[]){
    //     int max = Integer.MIN_VALUE;
    //     int idx = 0;
    //     for(int i=0;i<arr.length;i++){
    //         max = Math.max(max,arr[i]);
    //         if(max == arr[i]){
    //             idx = i;
    //         }

    //     }
    //     System.out.println(max);
    //     System.out.println(idx);
    // }

    // public static String Reverse(String str){
    //     String res = "";
    //     for(int i = str.length()-1;i>=0;i--){
    //         res += str.charAt(i);

    //     }
    //     return res;

    // }

    // public static int MaxXor(int arr[]){
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         int curr = 0;
    //         for(int j=i;j<arr.length;j++){
    //             curr = curr^arr[j];
    //              max = Math.max(max,curr);

    //         }
    //     }
    //     return max;

    // }

    // public static void Bin(int num){
    //     Stack<Integer> s = new Stack<>();
    //     while(num>0){
    //         int x = num%2;
    //         s.push(x);
    //         num = num/2;
    //     }
    //     while(!s.isEmpty()){
    //         System.out.print(s.pop()+"");
    //     }
    // }

    // count number of setbits
    public static int countSetBits(int num){
        int count = 0;
        while(num !=  0){
            num = num&(num-1);
            count++;
        }
        return count;
    }

    public static void sortSetBitsCount(ArrayList<Integer> arr, int size) {
		HashMap<Integer, ArrayList<Integer>> result = new HashMap<>();

		for (int i = 0; i < size; i++) {
			int key = countSetBits(arr.get(i));
			ArrayList<Integer> value = new ArrayList<>();

			if (result.containsKey(key)) {
				value.addAll(result.get(key));
			}

			value.add(arr.get(i));
			result.put(key, value);

		}

		arr.clear();
		for (int i = 32; i >= 0; i--) {
			if (result.containsKey(i)) {
				arr.addAll(result.get(i));
			}
		}
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
	}




    


    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(9);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(15);
        arr.add(32);
        sortSetBitsCount(arr, arr.size());
        




        // String str = "saveChangesInTheEditor";
        // UppLow(str);
        
       
        
    }
}