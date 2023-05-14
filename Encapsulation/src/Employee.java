class Employee {
    private int emp_id;
    private String emp_name;
    private int emp_age;
    private double emp_salary;

    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
    public String getEmp_name() {
        return emp_name;
    }
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    public int getEmp_age() {
        return emp_age;
    }
    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }
    public double getEmp_salary() {
        return emp_salary;
    }
    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }
}
class RunEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmp_id(123456);
        e.setEmp_name("ABC");
        e.setEmp_age(25);
        e.setEmp_salary(456123.85);
        System.out.println(e.getEmp_id());
        System.out.println(e.getEmp_name());
        System.out.println(e.getEmp_age());
        System.out.println(e.getEmp_salary());
    }
}