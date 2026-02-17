class Shape{
    private String color;

    public String getcolor(){
        return color;
    }
    public void setcolor(String color){
        this.color = color;
    }
}
class circle1 extends Shape {
    private double radius;

    public double getradius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }
}


public class Practice1 {
    static void main(String[] args) {

        circle1 c1 = new circle1();
        c1.setcolor("Blue");
        c1.setRadius(5.0);

        System.out.println("Color: " + c1.getcolor());
        System.out.println("Radius: " + c1.getradius());
        System.out.println("Area: " + c1.Area());

    }
}
