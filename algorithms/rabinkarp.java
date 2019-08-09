/*
  String search algorithm (rabin-karp).
  aim is to find the number of occurences of certain patterns in a string.
*/

import java.util.*;
import java.math.BigInteger;
public class rabinkarp{
  public static int prime = 17;
  public static void main(String[]args){
    String in = "abcdbcadefacefdeda";
    String search[] = {"cd","ab","a","f","c","be"};
    for(int i = 0;i<search.length;i++){
      ArrayList<Integer> Location = new ArrayList<Integer>();
      Location = rabinKarp(in,search[i]);
      System.out.println("pattern: "+search[i]+"found at index:"+Location.toString());
    }
  }

    public static ArrayList<Integer> rabinKarp(String in, String search){
      ArrayList<Integer> out = new ArrayList<Integer>();
      BigInteger hash = getHash(search);
      for(int i = 0;i<in.length()-search.length();i++){
        if(compare(search.substring(i, i+search.length()),hash)){
          if(in.substring(i,i+search.length()).equals(search)) out.add(i);
        }
      }
      return out;
    }

    //get the hash value of the pattern
    public static BigInteger getHash(String search){
      BigInteger Hash = new BigInteger("0");
      for(int i = 0;i<search.length();i++){
        int pow = (int)Math.pow(prime,i);
        BigInteger power = new BigInteger(pow+"");
        BigInteger a = new BigInteger((int)search.charAt(search.length()-i-1)+"");
        a = a.multiply(power);
        Hash = Hash.add(a);
      }
      return Hash;
    }

    //compare the hash values of the input and the pattern(search)
    public static boolean compare(String in, BigInteger Hash){
      BigInteger HashIn = getHash(in);
      if(HashIn.equals(Hash)) return true;
      return false;
    }
}
