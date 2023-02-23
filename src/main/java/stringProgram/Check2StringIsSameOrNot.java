package stringProgram;

import java.util.Arrays;

public class Check2StringIsSameOrNot {
    //check the 2 string is same or not
    public static void main(String[] args) {
        String st1="harshita";
        String st2="hitahars";
        char[] ch1=st1.toCharArray();
        char[] ch2=st2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1==ch1){
            System.out.println("its same");
        }else{
            System.out.println("its not");
        }

    }
}
