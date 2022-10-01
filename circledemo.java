interface shape2d{
    float pi= (float) 3.1415;
    double getarea();
}
class shape{
    void display(String s){
        System.out.println("name of the shape is circle");
    }
}
class circle extends shape implements shape2d{
    int radius;
    circle(int radius) {
        this.radius = radius;
    }
        public double getarea(){
            float PI=(float)3.1415;
            return PI*radius*radius;
        }
}
class square extends shape implements shape2d{
    int side;
    square(int side){
        this.side=side;
    }
    @Override
    public double getarea() {
        return side*side;
    }
}
class circledemo {
    public static void main(String[] args) {
        circle c=new circle(10);
        c.display("circle");
        System.out.println("the area of the circle is: "+c.getarea());
        square s=new square(10);
        s.display("square");
        System.out.println("the area of the square is: "+s.getarea());
    }
}
