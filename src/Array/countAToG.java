package Array;

// Given a string s of lowercase characters, return the count of pairs (i,j) such that i < j and s[i] is "a" and s[j] is "g"
public class countAToG {
  public static int countPairs(String[] s ){
      int count = 0;
      int n = s.length;
      for(int i = 0; i < n; i++){
          if(s[i].equals("a")){
              for(int j = i + 1; j < n; j++){
                  if(s[j].equals("g")){
                      count++;
                  }
              }
          }
      }
      return count;
  }
  public static void main(String[] args){
      String[] s = {"a", "c", "g", "d", "g", "a", "g"};
      int result = countPairs(s);
      System.out.print("RESULT: "+ result);
  }
}
