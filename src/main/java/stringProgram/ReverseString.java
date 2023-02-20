package stringProgram;

public class ReverseString {
    public static void main(String[] args) {
        String x="Harshita kothale";
        char[] y=x.toCharArray();
        int size=y.length;
        char[] rev=new char[size];
        int i=0;
        while( i !=size){
            rev[size-1-i]=y[i];
            i++;
        }
        System.out.println(rev);

        System.out.println("2nd approch");

        String reverse="";
        for(int j=x.length()-1;j>=0;j--){
            char ch=x.charAt(j);
            reverse=reverse+ch;
        }
        System.out.println(reverse);



    }
}
