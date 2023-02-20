public class PrimeNumberORNot {
    public static void checkPrimeNum(int a) {
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                System.out.println("it not prime no");
                break;
            } else {
                System.out.println("it prime no");
                break;
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumberORNot.checkPrimeNum(11);
    }
}
