class Box {
    private double height, width, depth;
    
    public void setBox(){
        height = width = depth = 1.1;
    }

    public void setBox(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double calculateVolume(){
        return height * width * depth;
    }

    public void display(){
        System.out.println("\nHeight:"+height);
        System.out.println("Width:"+width);
        System.out.println("Depth:"+depth);
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.setBox();
        b.display();
        System.out.println("\nVolume:"+b.calculateVolume()); 
        Box b1 = new Box();
        b1.setBox(23.2, 34.2, 45.5);
        b1.display();
        System.out.println("\nVolume:"+b1.calculateVolume());
    }
    
}
