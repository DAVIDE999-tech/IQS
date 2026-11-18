package Composite;

public class LeafEmployee implements Component {
    private String name;
    private String dept;
    private int salary;

    public LeafEmployee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "LeafEmployee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public String getDescription() {
        return toString();
    }
}
