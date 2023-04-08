public class Sephian {
    void status(){
        System.out.println("Sephian is a live object.");
    }
}
class Human extends Sephian{
    @Override
    void status() {
        System.out.println("Human is a live object.");
    }
}
class Man extends Sephian{
    @Override
    void status() {
        System.out.println("Man is a live object.");
    }
}
class Gawesh extends Man{
    @Override
    void status() {
        System.out.println("Gawesh is a live object.");
    }
}
class Test{
    public static void main(String[] args) {
        Sephian s = new Sephian();
        Sephian h = new Human();
        Sephian m = new Man();
        Sephian g = new Gawesh();
        s.status();
        h.status();
        m.status();
        g.status();
    }
}