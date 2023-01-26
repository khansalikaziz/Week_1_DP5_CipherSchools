package Week_1_DP5_CipherSchools.Class7;

public class Class7 {
    public static void printAllDecoding(String number,String output){
        if(number.length()==0){
            System.out.print(output);
            return;
        }
        String firstChar=number.substring(0,1);

        int firstNumber = Integer.parseInt(firstChar);
        char character;
        if(firstNumber!=0){
            character=(char) ('a'+firstNumber-1);
            printAllDecoding(number.substring(1),output+character);
        }

        if(number.length()<=1){
            return;
        }
        int firstTwoNumber=Integer.parseInt(number.substring(0,2));

        if(firstTwoNumber<=26){
            if(firstTwoNumber<=0){
                printAllDecoding(number.substring(2),output);
                return;
            }
            character=(char) ('a'+firstTwoNumber-1);
            printAllDecoding(number.substring(2),output+character);
        }

    }
    public static void main(String[] args) {
        printAllDecoding("23","");
    }
}
