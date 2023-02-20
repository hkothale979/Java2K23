package stringProgram;

public class CopyingStringIntoAnther {
    public static void main(String[] args) {
        String s="Harshita Kothale";
        char ch[]=s.toCharArray();

        int size= ch.length;
        char[] a= new char[size];
        int i = 0;
        while(i!=size){
            a[i]=ch[i];
            i++;

        }
        System.out.println(a);
        System.out.println(ch);
    }
}
