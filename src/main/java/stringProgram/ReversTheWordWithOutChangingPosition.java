public class ReversTheWordWithOutChangingPosition {
//Interview que
  /*  Input - Hi Vtest
    Output - iH tsetV*/

    public static void main(String[] args) {
        String a= "Hi Vtest";
        String[] ab=a.split(" ");
        for(String str : ab){
            String rev ="";
            for(int i=str.length()-1;i>=0;i--){
                char c=str.charAt(i);
                rev = rev + c;

            }
            System.out.print(rev);
        }
    }
}
