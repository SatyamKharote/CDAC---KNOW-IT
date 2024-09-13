class Date{
    private int date, month, year;

    public void setDate(){
        date = month = 1;
        year = 2001;
    }

    public void setDate(int date, int month, int year){
        
        this.date = date;
        this.month = month;
        this.year =  year;
    }

    public void setDate(int date){
        this.date = date;
    }


    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }
    public void getDate(){
        System.out.println(date+"/"+month+"/"+year);
    }

    public int getDay(){
        return date;
    }
    
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public static void main(String[] args) {
        Date date = new Date();
        date.setDate();
        date.getDate();
        
        Date date1 = new Date();
        date1.setDate(22, 11, 2001);
        date1.getDate();

        Date date2 = new Date();
        date2.setDate(1);
        System.out.println(date2.getDay());

        
        Date date3 = new Date();
        date3.setMonth(2);
        System.out.println(date3.getMonth());

        
        Date date4 = new Date();
        date4.setYear(2003);
        System.out.println(date4.getYear());
    }
}


