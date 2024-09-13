class Point {
    private int x, y;
    
    public void getPoint(){
        x = y = 1;
    }

    public void getPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void displayPoint(){
        System.out.println("["+x+","+y+"]");
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.getPoint();
        p.displayPoint();

        Point p1 = new Point();
        p1.getPoint(12, 13);
        p1.displayPoint();
    }
}
