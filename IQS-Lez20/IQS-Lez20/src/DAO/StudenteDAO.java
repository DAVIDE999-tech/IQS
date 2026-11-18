package DAO;

import DbInterface.DbConnection;
import DbInterface.IDbConnection;
import Model.Studente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudenteDAO implements IStudenteDAO {
    private static StudenteDAO instance = new StudenteDAO();
    private static IDbConnection connection;

    private StudenteDAO() {
        connection = null;
    }

    public static StudenteDAO getInstance() {
        return instance;
    }

    @Override
    public Studente findById(String matricola) {
        connection = DbConnection.getInstance();
        Studente studente = null;
        try {
            ResultSet resultSet = connection.executeQuery(
                    "SELECT nome, cognome, matricola, email, telefono " +
                            "FROM studente " +
                            "WHERE matricola = '" + matricola + "';"); //WARNING SQL INJECTION
            if (resultSet.next()) {
                studente = new Studente();
                studente.setNome(resultSet.getString("nome"));
                studente.setCognome(resultSet.getString("cognome"));
                studente.setMatricola(resultSet.getString("matricola"));
                studente.setEmail(resultSet.getString("email"));
                studente.setTelefono(resultSet.getString("telefono"));
            }
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Errore SQL: " + e.getMessage());
        } finally {
            connection.close();
        }
        return studente;
    }

    @Override
    public List<Studente> findAll() {
        connection = DbConnection.getInstance();
        List<Studente> studenti = new ArrayList<>();
        try {
            ResultSet resultSet = connection.executeQuery(
                    "SELECT nome, cognome, matricola, email, telefono " +
                            "FROM studente;"
            );
            while (resultSet.next()) {
                Studente studente = new Studente();
                studente.setNome(resultSet.getString("nome"));
                studente.setCognome(resultSet.getString("cognome"));
                studente.setMatricola(resultSet.getString("matricola"));
                studente.setEmail(resultSet.getString("email"));
                studente.setTelefono(resultSet.getString("telefono"));
                studenti.add(studente);
            }
        } catch (SQLException e) {
            System.out.println("Errore SQL: " + e.getMessage());
        } finally {
            connection.close();
        }
        return studenti;
    }

    @Override
    public int add(Studente studente) {
        connection = DbConnection.getInstance();
        int affectedRows = connection.executeUpdate(
                "INSERT INTO studente(nome, cognome, matricola, email, telefono) " +
                        "VALUES ('" + studente.getNome() + "', '" + studente.getCognome() + "', '" +
                        studente.getMatricola() + "', '" + studente.getEmail() + "', '" +
                        studente.getTelefono() + "');"
        );
        connection.close();
        return affectedRows;
    }

    @Override
    public int removeById(String matricola) {
        connection = DbConnection.getInstance();
        int affectedRows = connection.executeUpdate(
                "DELETE FROM studente WHERE matricola = '" + matricola + "';"
        );
        connection.close();
        return affectedRows;
    }

    @Override
    public int update(Studente studente) {
        connection = DbConnection.getInstance();
        int affectedRows = connection.executeUpdate(
                "UPDATE studente SET nome = '" + studente.getNome() +
                        "', cognome = '" + studente.getCognome() +
                        "', matricola = '" + studente.getMatricola() +
                        "', email = '" + studente.getEmail() +
                        "', telefono = '" + studente.getTelefono() + "' " +
                        "WHERE matricola = '" + studente.getMatricola() + "';"
        );
        connection.close();
        return affectedRows;
    }
}
