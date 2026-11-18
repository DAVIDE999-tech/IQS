package DbInterface;

public class TestDriver {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Ho caricato la classe " + cls.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Non trovo il driver per la connessione a MySQL.");
        }
    }
}
