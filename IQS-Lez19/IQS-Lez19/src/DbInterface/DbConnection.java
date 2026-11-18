package DbInterface;

import java.sql.*;

public class DbConnection implements IDBConnection {
    private static DbUser dbUser = DbUser.getInstance();
    private static DbConnection instance = new DbConnection();
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static int affectedRows;

    private DbConnection() {
        conn = null;
        stmt = null;
        rs = null;
        affectedRows = 0;
        try {
            Class cls = Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Ho caricato la classe " + cls.getName());
        } catch(ClassNotFoundException e) {
            System.out.println("Non trovo il driver per la connessione a MySQL.");
        }
    }

    public static DbConnection getInstance() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + dbUser.getSchemaName() + "?serverTimeZone=UTC",
                    dbUser.getUserName(),
                    dbUser.getPwd());
        } catch(SQLException e) {
            System.out.println("Errore SQL: " + e.getMessage());
        }
        return instance;
    }

    @Override
    public ResultSet executeQuery(String sqlStatement) {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlStatement);
        } catch(SQLException e) {
            System.out.println("Errore SQL: " + e.getMessage());
        }
        return rs;
    }

    @Override
    public int executeUpdate(String sqlStatement) {
        try {
            stmt = conn.createStatement();
            affectedRows = stmt.executeUpdate(sqlStatement);
        } catch(SQLException e) {
            System.out.println("Errore SQL: " + e.getMessage());
        }
        return 0;
    }

    @Override
    public void close() {
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
