abstract public class Human {
    Human(){
        System.out.println("Constructor is running!");
    }
    abstract void eat();
    abstract void walk();
    void breathing(){
        System.out.println("Breathing!");
    }
}
class Man extends Human{
    @Override
    void eat() {
        System.out.println("Anything Eat!");
    }
    void walk() {
        System.out.println("Anykind of walk!");
    }
    void breathing() {
        super.breathing();
        System.out.println("Lab Dab!");
    }
}
class Gawesh extends Man{
    @Override
    void breathing() {
        super.breathing();
        System.out.println("Gawesh Breathing!");
    }
    void eat() {
        super.eat();
        System.out.println("Eating Food!");
    }
    void walk() {
        super.walk();
        System.out.println("Gawesh Running!");
    }
}
class Running{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Gawesh();
        Man m = new Gawesh();
        h.eat();
        h.walk();
        h.breathing();
        h1.eat();
        h1.walk();
        h1.breathing();
        m.eat();
        m.walk();
        m.breathing();
    }
}