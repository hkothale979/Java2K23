public class Calculator {
    public int add(int a , int b){
        int result=a + b;
        return result;
    }
    public int sub(int a , int b){
        int result=a - b;
        return result;
    }
    public int div(int a , int b){
        return a / b;
    }
    public int multi(int a , int b){
        int result=a * b;
        return result;
    }

    public static void main(String[] args) {
        Calculator cl=new Calculator();
       System.out.println(cl.add(20,67));
        cl.div(34,67);
    }
}
