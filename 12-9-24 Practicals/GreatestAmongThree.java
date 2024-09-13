public class GreatestAmongThree {
    public static void main(String[] args) {
        int a=10, b=45, c=50;

        int greatest = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        
        System.out.println("Greatest among the three no is:"+greatest);
    }
}
