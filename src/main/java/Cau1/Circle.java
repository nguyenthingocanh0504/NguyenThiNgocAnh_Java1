package Cau1;

public class Circle {
    private double radius=1.0;
    public Circle(){

    }

    public Circle(double radius) {
        if (radius<=0){
            throw new RuntimeException("Error");
        }else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            throw new RuntimeException("Error");
        }else {
            this.radius = radius;
        }
    }
    public double getArea(){
        return Math.PI*2*radius;
    }
    public double getCircumferce(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
