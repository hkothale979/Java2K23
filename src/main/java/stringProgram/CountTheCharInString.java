package stringProgram;

public class CountTheCharInString {

    public static void main(String[] args) {
        String a="abhakadjfdur";
        char c='a';
        char[] a1=a.toCharArray();
        int count=0;
        for(char ch : a1){
            if(ch==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
