package Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeEmployee implements Component {
    private String name;
    private String dept;
    private int salary;
    private List<Component> subordinates;

    public CompositeEmployee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Component component) {
        subordinates.add(component);
    }

    public void removeSubordinate(Component component) {
        subordinates.remove(component);
    }

    public List<Component> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "CompositeEmployee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public String getDescription() {
        String description = toString();
        description = description + "\n" + "Elenco dei subordinati: " + "\n";
        Iterator<Component> subordinatesIterator = subordinates.iterator();
        while (subordinatesIterator.hasNext()) {
            Component component = subordinatesIterator.next();
            description = description + "\n" + component.getDescription();
        }
        return description;
    }
}
