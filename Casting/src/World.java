public class World {
    String name;
    void process(){
        System.out.println("World can rotate.");
    }
}
class Earth extends World{
    int area;

    @Override
    void process() {
        System.out.println("Earth is a world.");
    }
}
class TestCasting{
    public static void main(String[] args) {
        World w = new Earth();
        w.name = "Earth";
        System.out.println(w.name);
        w.process();
        Earth e = (Earth) w;
        e.area = 510;
        System.out.println(w.name);
        System.out.println(e.area);
        e.process();
    }
}