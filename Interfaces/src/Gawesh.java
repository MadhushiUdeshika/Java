public interface Gawesh {
    public abstract void sound();
    public abstract void sleep();
}
class Human implements Gawesh {
    @Override
    public void sound() {
        System.out.println("grrr.... grrr....");
    }
    public void sleep() {
        System.out.println("soos.... soos....");
    }
}
class MainM {
    public static void main(String[] args) {
        Human h = new Human();
        h.sound();
        h.sleep();
    }
}