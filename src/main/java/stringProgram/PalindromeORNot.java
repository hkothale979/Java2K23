package stringProgram;

public class PalindromeORNot {
    public static void main(String[] args) {
        String x="mom dad woe";
        String[] z=x.split(" ");

        for(String word: z) {
            String rev="";
            for (int i = word.length() - 1; i >= 0; i--) {
                char ch = word.charAt(i);
                rev = rev + ch;
            }
            System.out.println(rev);

            if (rev.equals(word)) {
                System.out.println("its Palindrome"+ word);
            } else {
                System.out.println("its not Palindrome" + word);
            }
        }
    }
}
