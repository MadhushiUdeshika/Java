abstract public class School {
    void teaching(){
        System.out.println("Teaching!");
    }
    abstract void learning();
}
class Grade11 extends School{
    @Override
    void learning() {
        System.out.println("Grade 11 students learning well!");
    }

    @Override
    void teaching() {
        super.teaching();
        System.out.println("Teachers are teaching well1");
    }
}
class runSchool{
    public static void main(String[] args) {
        School s = new Grade11();
        s.learning();
        s.teaching();
    }
}