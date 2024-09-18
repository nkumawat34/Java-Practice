//Compile Polymorphism
class Poly
{
    void area(int size){
          System.out.println("Area of square is "+size*size);

    }
    void area(int length,int breadth)
    {
        System.out.println("Area of rectangle is "+length*breadth);
    }
    void area(double radius)
    {
        System.out.println("Area of circle is "+Math.PI*radius*radius);
    }

}// Abstract class Shape
abstract class Shape {
    // Abstract method area
    abstract void area();
}

// Subclass Circle that extends Shape
class Circle extends Shape {
    double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Override the area method to provide the area of a circle
    @Override
    void area() {
        System.out.println("Area of the circle is: " + Math.PI * radius * radius);
    }
}



public class Polymorphism {

    public static  void main(String args[])
    {
        /*
        Poly p=new Poly();

        //Area of Sqaure
        p.area(4);

        //Area of Rectangle
        p.area(4,5);

        //Area of Circle
        p.area(2.3);
        */

         Shape shape = new Circle(5);
         shape.area();
    }
}
