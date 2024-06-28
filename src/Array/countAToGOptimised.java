package Array;

public class countAToGOptimised {
    public static int countPairs(String[] s){
        int n = s.length;
        int countA = 0;
        int ans = 0;

        for(int i = 0; i < n; i++){
            if(s[i].equals("a")){
                countA++;
            } else if(s[i].equals("g")){
                ans = ans + countA;
            }
        }
        return ans;
    }


    public static void main(String[] args){
        String[] s = {"a", "c", "g", "d", "g", "a", "g"};
        int result = countPairs(s);
        System.out.print("RESULT: "+ result);
    }
}
