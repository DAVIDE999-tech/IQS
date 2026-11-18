package Composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        CompositeEmployee ceo = new CompositeEmployee("Alessandro", "CEO", 8000);
        CompositeEmployee headDev = new CompositeEmployee("Luigi", "Development", 4000);
        CompositeEmployee headMarketing = new CompositeEmployee("Adriana", "Marketing", 5000);

        LeafEmployee dev1 = new LeafEmployee("Marco", "Development", 2000);
        LeafEmployee dev2 = new LeafEmployee("Luisa", "Development", 2000);
        LeafEmployee clerk1 = new LeafEmployee("Antonio", "Marketing", 2500);
        LeafEmployee clerk2 = new LeafEmployee("Maria", "Marketing", 2500);

        ceo.addSubordinate(headDev);
        ceo.addSubordinate(headMarketing);

        headDev.addSubordinate(dev1);
        headDev.addSubordinate(dev2);

        headMarketing.addSubordinate(clerk1);
        headMarketing.addSubordinate(clerk2);

        System.out.println(ceo.getDescription());

        System.out.println(headDev.getDescription());

        System.out.println(dev1.getDescription());
    }
}
