class MyNumber{
    private int no;

    MyNumber(){
        no = 0;
    }

    MyNumber(int no){
        this.no = no;
    }

    
    public void isOdd(){
        if(no % 2 != 0){
            System.out.println(no + " is Odd");
        }
    }

    public void isEven(){
        if(no % 2 == 0){
            System.out.println(no + " is Even");
        }
    }

    public void isZero(){
        if(no == 0){
            System.out.println(no + " is zero");
        }
    }

    public void isPositive(){
        if(no > 0){
            System.out.println(no + " is positive");
        }
    }

    public void isNegative(){
        if(no < 0){
            System.out.println(no + " is negative");
        }
    }

    public static void main(String[] args) {
        MyNumber mn = new MyNumber(0);
        mn.isOdd();
        mn.isEven();
        mn.isPositive();
        mn.isNegative();
        mn.isZero();
    }
}