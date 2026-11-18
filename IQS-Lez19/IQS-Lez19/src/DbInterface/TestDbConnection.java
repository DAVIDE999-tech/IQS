package DbInterface;

import java.sql.*;

public class TestDbConnection {
    public static void main(String[] args) {
        IDBConnection conn = DbConnection.getInstance();
        try {
            ResultSet rs = conn.executeQuery("SELECT nome, cognome, matricola, email, telefono FROM studente WHERE nome = 'Luigi';");
            while (rs.next()) {
                System.out.print(rs.getString("nome") + " ");
                System.out.print(rs.getString("cognome") + " ");
                System.out.print(rs.getString("matricola") + " ");
                System.out.print(rs.getString("email") + " ");
                System.out.println(rs.getString("telefono"));
            }
        } catch (SQLException e) {
            System.out.println("Errore SQL: " + e.getMessage());
        } finally {
            conn.close();
        }
    }
}
