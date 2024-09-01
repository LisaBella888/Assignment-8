
package arraylist;

import java.util.*;
public class Arraylist {
   
  public static int[] inPut(int n){
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      int[] arr = new int[n];
      for(int i =0;i<n;i++)
      {
          arr[i] = sc.nextInt();
      }
      return arr;
  }

    public static void out(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }    
    }
    
    public static void max2(int[] arr) {
         int max1 = arr[0];
         int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max1)
            {
                max1 = arr[i]; 
            }
            if(max2 <= max1 && max2 > arr[i])
            {
                max2 = arr[i];
            }
        }
//        return max2;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        int[] arr = inPut(n);
        max2(arr);
        //out(arr);
    }
    
}
