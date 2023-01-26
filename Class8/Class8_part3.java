package Week_1_DP5_CipherSchools.Class8;

public class Class8_part3 {
    public static int factUsingTailCall(int number,int ans){
        if(number==1){
            return ans;
        }
        return factUsingTailCall(number-1,ans*number);
    }

    public static void main(String[] args) {
        System.out.println(factUsingTailCall(5,1));
    }
}
