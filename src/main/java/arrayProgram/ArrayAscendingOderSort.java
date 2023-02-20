package arrayProgram;

public class ArrayAscendingOderSort {
    public static void main(String[] args) {
        int[] a={34,5,6,3,2,5,6};
        int temp;
        for(int i=0;i < a.length;i++){
            for(int j= i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    //swap
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
