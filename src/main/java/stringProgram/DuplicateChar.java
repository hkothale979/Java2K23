package stringProgram;

public class DuplicateChar {
    public static void main(String[] args) {
        String inputString = "Great responsibility";
        char[] chars = inputString.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            for(int j = i + 1; j < chars.length; j++) {
                if(chars[i] == chars[j]) {
                    System.out.println(chars[j]);

                }
            }
        }
    }
}
