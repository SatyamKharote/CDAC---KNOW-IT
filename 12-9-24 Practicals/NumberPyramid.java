public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5; 
        int noOfSpaces = n - 1;

        for (int i = 1; i <= n; i++) {

            
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print("  "); 
            }

            
            int start = 1;
            
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start++;
            }

           
            start = i - 1;
            for(int j=1; j<i; j++){
                System.out.print(start+" ");
                start--;
            }
            System.out.println();

            
            noOfSpaces--;
        }
    }
}
