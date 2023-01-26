package Week_1_DP5_CipherSchools.Class8;

public class Class8_part2 {
    public static void helper(int left,int right,String output){
        if(left>right){
            return;
        }
        if(left==0 && right==0){
            System.out.println(output);
            return;
        }
        if(left>0){
            helper(left-1,right,output+"(");
        }
       if(right>0){
           helper(left,right-1,output+")");
       }
    }
    public static void generateParenthesis(int number){
        helper(number,number,"");
    }

    public static void main(String[] args) {
          generateParenthesis(3);
    }
}
