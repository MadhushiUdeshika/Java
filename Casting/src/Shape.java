public class Shape {
    String shape;
    void draw(){
        System.out.println("I am a 2D shape.");
    }
}
class Square extends Shape{
    String square;
    void draw(){
        System.out.println("I am a square.");
    }
}
class Circle extends Shape{
    String circle;
    void draw(){
        System.out.println("I am a circle");
    }
}
class Traingle extends Shape{
    String traingle;
    void draw(){
        System.out.println("I am a traingle.");
    }
    public static void main(String[] args) {

        //Upcasting
        Shape s = new Square();
        Shape h = new Circle();
        Shape a = new Traingle();
        s.draw();
        h.draw();
        a.draw();
        s.shape = "Square";
        h.shape = "Circle";
        a.shape = "Triangle";
        System.out.println(""+ s.shape + "\n" + h.shape + "\n" + a.shape);

        //Downcasting
        Square q = (Square) s;
        Circle c = (Circle) h;
        Traingle t = (Traingle) a;
        q.square = "A";
        c.circle = "B";
        t.traingle = "c";
        System.out.println(""+ q.square + "\n" + c.circle + "\n" + t.traingle);
        q.draw();
        c.draw();
        t.draw();
    }
}