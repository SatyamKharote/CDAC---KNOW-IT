class Calculator {
    private int no1, no2;
    
    public void getNo(){
        no1 = no2 = 1;
    }

    public void getNo(int no1, int no2){
        this.no1 = no1;
        this.no2 = no2;
    }

    public int addition(){
        return no1 + no2;
    }
    
    public int subtraction(){
        return no1 - no2;
    }

    public int multiplication(){
        return no1 * no2;
    }

    public int division(){
        return no1 / no2;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.getNo(10, 5);
        System.out.println("Addition:"+c1.addition());
        System.out.println("Subtraction:"+c1.subtraction());
        System.out.println("Multiplication:"+c1.multiplication());
        System.out.println("Division:"+c1.division());
    }
}
