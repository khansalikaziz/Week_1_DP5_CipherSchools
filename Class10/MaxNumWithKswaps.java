package Week_1_DP5_CipherSchools.Class10;

public class MaxNumWithKswaps {
    public static String swap(String s,int i,int j){
        char ith=s.charAt(i);
        char jth=s.charAt(j);
        String left=s.substring(0,i);
        String middle=s.substring(i+1,j);
        String right=s.substring(j+1);
        return left+jth+middle+ith+right;
    }
    static String max="0";
    public static void finfMaximum(String str,int k){
        if(Integer.parseInt(str)>Integer.parseInt(max)){
            max=str;
        }
        if(k==0){
            return;
        }
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)<str.charAt(j)){
                    //do swap
                    str=swap(str,i,j);
                    finfMaximum(str,k-1);
                    //backtrack to original state
                    str=swap(str,i,j);
                }
            }
        }
    }
    public static void main(String[] args) {
         String s="254";
         int k=2;
        finfMaximum(s,k);
        System.out.println(max);
    }
}
