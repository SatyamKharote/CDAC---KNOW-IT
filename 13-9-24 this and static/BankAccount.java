class BankAccount{

    private int accno;
    private double balance;

    private static float intRate; 
    BankAccount(){
        accno = 101;
        balance = 10000.00;
    }

    BankAccount(int accno, double balance){
        this.accno = accno;
        this.balance = balance;
    }

    static{
        intRate = 7.25f;
    }

    public static float updateInterestRate(float newRateOfInterest){
        return intRate = newRateOfInterest;
    }

    public double calculateBalance(){
        return balance + (balance * intRate / 100);
    }
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(10301, 10000.0);
        System.out.println("Balance:"+ba.calculateBalance());

        BankAccount.updateInterestRate(7.79f);
        System.out.println("New Balance:"+ba.calculateBalance());
    }
}