package Cau1;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);
        System.out.println("Chu vi hinh tron la: "+c.getArea());
        System.out.println("Dien tich hinh tron la: "+c.getCircumferce());

        Circle c2 = new Circle(5);
        System.out.println(c2);
        System.out.println("Chu vi hinh tron la: "+c2.getArea());
        System.out.println("Dien tich hinh tron la: "+c2.getCircumferce());
//        Nếu bán kính không hợp lệ -> ném ra RuntimeException có meesage là "Error";
        try{
            Circle c3 = new Circle(-100);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
