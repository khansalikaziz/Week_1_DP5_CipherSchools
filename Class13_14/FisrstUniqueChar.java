package Week_1_DP5_CipherSchools.Class13_14;

public class FisrstUniqueChar {
    /*
    1. Create an array of 256 characters
    2. Iterate over the string, and
       a. c=get correct character
       b. check this character is in our array or not
       if(notAvailable)
          createNode for this character and update in dll
       else
          delete this node from dll
       print the head of dll
     */
    public static void printFirstUniqueCharacter(String str){
        int size=str.length();
        DllNode[] charMap=new DllNode[256];
        boolean[] repeated=new boolean[256];
        DllOperation dll=new DllOperation();
        for(int i=0;i<size;i++){
            char c=str.charAt(i);
            if(!repeated[c]){
                if(charMap[c]==null){
                    dll.append(c);
                    charMap[c]= dll.last;
                }else{
                    dll.delete(charMap[c]);
                    repeated[c]=true;
                }
            }
            if(dll.head!=null){
                System.out.println("First unique character "+dll.head.data);
            }

        }
    }
}
