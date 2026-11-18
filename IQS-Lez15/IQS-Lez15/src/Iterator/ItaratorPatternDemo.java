package Iterator;

public class ItaratorPatternDemo {
    public static void main(String[] args) {
        String[] names = {"Luigi", "Marta", "Antonio", "Francesca"};

        Container nameRepository = new NameRepository(names);

        Iterator iterator = nameRepository.getIterator();

        while (iterator.hasNext()) {
            System.out.println("Nome: " + iterator.next());
        }
    }
}
