public class half_inverted_triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <n; i++) {
            for (int j = 0; j<n-i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
