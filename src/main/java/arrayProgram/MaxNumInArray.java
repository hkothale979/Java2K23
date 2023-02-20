package arrayProgram;

public class MaxNumInArray {
    public static void main(String[] args) {
        int[] a= {2,3,34,5,2,3,53,2,4,5,6};
        int max=0;
        for(int i=0;i<a.length;i++){
             if(max<a[i]){
                 max=a[i];
                 i++;
             }
        }
        System.out.println(max);
    }
}
