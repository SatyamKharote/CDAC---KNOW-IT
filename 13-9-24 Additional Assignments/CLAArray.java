public class CLAArray {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide integer command-line arguments.");
            return;
        }

       
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);  
        }


        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];
        }


        double average = (double) sum / numbers.length;


        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);
    }
}
