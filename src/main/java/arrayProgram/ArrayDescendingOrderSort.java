package arrayProgram;

public class ArrayDescendingOrderSort {
    public static void main(String[] args) {
        int[] a={23,45,6,7,3,2,56,7};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=1+i;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
               }
            }
            System.out.println(a[i]);
        }
    }
}
