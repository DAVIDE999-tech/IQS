package DbInterface;

import java.sql.ResultSet;

public interface IDBConnection {
    ResultSet executeQuery(String sqlStatement); // Per le SELECT
    int executeUpdate(String sqlStatement); // Per UPDATE, INSERT, DELETE
    void close();
}
