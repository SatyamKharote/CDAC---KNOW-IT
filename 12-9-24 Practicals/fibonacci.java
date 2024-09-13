public class fibonacci {
    public static void main(String[] args) {
        int num = 10;
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.println("Fibonacci Series of 10 is:");
        for (int i = 0; i < num - 1; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }
    }
}
