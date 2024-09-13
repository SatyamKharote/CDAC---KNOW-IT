import java.lang.Thread.State;

class Book {
    private int bookId;
    private String bookName;
    private double bookPrice;
    
    private static int count;
    Book(){
        bookName = "Avengers:Endgame";
    }

    Book(String bookName){
        
        this.bookName = bookName;
        
    }

    public void setPrice(double bookPrice){
        count++;
        this.bookPrice = bookPrice;
        bookId = count;
    }

    public void display(){
        System.out.println("Book ID:"+bookId);
        System.out.println("Book Name:"+bookName);
        System.out.println("Book Price:"+bookPrice);
    }
    static{
        count = 0;
    }

    public static void main(String[] args) {
        Book b = new Book("Avengers:Infinity War");
        b.setPrice(2000.00);
        b.display();

        Book b1 = new Book("Avengers: Age of Ultron");
        b1.setPrice(3000.00);
        b1.display();
    }

}
