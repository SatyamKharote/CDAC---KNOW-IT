public class Date {
    private int day;
    private int month;
    private int year;

    Date(){
        day=month=1;
        year = 2001;
    }

    Date(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void display(){
        System.out.println(day+"/"+month+"/"+year);
    }
}
