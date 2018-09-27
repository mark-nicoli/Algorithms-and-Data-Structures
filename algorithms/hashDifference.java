//find diff - the difference between 2 array elements and how many times diff appears. 

import java.util.*;
public class hashDifference{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();              //size of the array
    int diff = scan.nextInt();              //difference between 2 array elements
    int array[] = new int[size];
    for(int i=0;i<size; i++){
      array[i] = scan.nextInt();
    }

    System.out.println(sum(array,diff));
  }

  public static int sum(int[]array, int diff){
    int c = 0;
    HashMap<Integer,Integer> difference = new HashMap<Integer,Integer>();
    for(int i = 0;i<array.length;i++){
      difference.put(diff - array[i],i);
    }
    for(int i =0;i<array.length;i++){
      int cur = -array[i];
      if(difference.containsKey(cur)&&difference.get(cur)!=i){
        c++;
      }
    }
    return c;
  }
}
