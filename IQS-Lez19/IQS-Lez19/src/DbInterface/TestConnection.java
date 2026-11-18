package DbInterface;

import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {
        DbUser dbUser = DbUser.getInstance();
        try {
            Class cls = Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Ho caricato la classe " + cls.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Non trovo il driver per la connessione a MySQL.");
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + dbUser.getSchemaName() + "?serverTimeZone=UTC",
                    dbUser.getUserName(),
                    dbUser.getPwd());
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT nome, cognome, matricola, email, telefono FROM studente WHERE nome = 'Luigi';");
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
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Errore SQL: " + e.getMessage());
                }
                rs = null;
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.out.println("Errore SQL: " + e.getMessage());
                }
                stmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Errore SQL: " + e.getMessage());
                }
                conn = null;
            }
        }
    }
}
