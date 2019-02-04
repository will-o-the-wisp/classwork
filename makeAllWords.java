import java.util.List;
import java.util.ArrayList;

public class makeAllWords{
  public static void main(String[] args){
    System.out.println(arytoString(makeAllWords(3,3)));
  }
  public static String arytoString(List<String> l){
    String ans="[";
    for(int i=0;i<l.size();i++){
      ans+=l.get(i)+" ,";
    }
    ans+="]";
    return ans;
  }
//  public static List<String> makeAllWords(int k){
//    return helper(k,0,[""]);
//  }
  private static void helper(int k, String word, int maxLetter, List data){
    if(k==0){
      data.add(word);
    }
    for(int i=0;i<maxLetter;i++){
      word+=(char)('a'+i);
      helper(k-1,word,maxLetter,data);
    }
  }
  public static List<String> makeAllWords(int k, int maxLetter){
      ArrayList<String> a = new ArrayList<String>();
      helper(k,"",maxLetter,a);
      return a;
  }
}
