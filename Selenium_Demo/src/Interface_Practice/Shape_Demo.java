package Interface_Practice;

interface Shape {
    void draw();
    void area();
}

class Circle implements Shape {
   
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    
    public void area() {
        double radius = 10;
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle implements Shape {
    
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }

   
    public void area() {
        double length = 10.2;
        double breadth = 5;
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class Shape_Demo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.area();

        Rectangle r = new Rectangle();
        r.draw();
        r.area();
    }
}
