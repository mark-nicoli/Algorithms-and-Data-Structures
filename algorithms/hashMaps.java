import java.util.*;

public class hashMaps{
  public static void main(String[]args){
    HashMap<String,String>hash = new HashMap<>();
    hash.put("Learning","To hash");
    hash.put("not", "bad");
    if(!hash.isEmpty()){
      System.out.println("hash is not empty");
      System.out.println("hash: "+hash.get("Learning"));
      System.out.println("hash: "+hash.get("not"));
    }
  }
}
