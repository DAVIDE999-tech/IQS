package DAO;

import Model.Studente;

import java.util.List;

public interface IStudenteDAO {
    Studente findById(String matricola);
    List<Studente> findAll();
    int add(Studente studente);
    int removeById(String matricola);
    //int remove(Studente studente);
    int update(Studente studente);
}
