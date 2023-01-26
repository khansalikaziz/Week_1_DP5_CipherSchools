package Week_1_DP5_CipherSchools.Class6;

public class Class6 {
    //considering the top right corner
    public static boolean isExists(int[][] matrix,int targetValue){
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            int currentElement=matrix[i][j];
            if(currentElement == targetValue){
                return true;
            } else if (currentElement>targetValue) {
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(isExists(matrix,8));
        System.out.println(isExists(matrix,-1));
    }
}
