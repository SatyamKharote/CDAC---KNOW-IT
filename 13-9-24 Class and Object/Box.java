class Box {
    private double height, width, depth;
    
    Box(){
        height = width = depth = 1.1;
    }

    Box(double height, double width, double depth){
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
        Box b[] = {
            new Box(23.3, 45.6, 12.3),
            new Box(13.3, 25.6, 10.3),
            new Box(3.3, 5.6, 2.3)
        };
       
        for(int i=0; i<b.length; i++){
            b[i].display();
            System.out.println("Volume:"+b[i].calculateVolume()) ;
        }
    }
    
}
