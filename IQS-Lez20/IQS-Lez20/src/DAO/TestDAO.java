package DAO;

import Model.Studente;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TestDAO {
    public static void main(String[] args) {
        IStudenteDAO studenteDAO = StudenteDAO.getInstance();
        System.out.println("Elenco degli studenti presenti:");
        List<Studente> studenti = studenteDAO.findAll();
        ListIterator<Studente> iterator = studenti.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.print("Inserire la matricola dello studente voluto: ");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Studente studente = studenteDAO.findById(input);
        System.out.println("I dati dello studente voluto sono i seguenti:");
        System.out.println(studente);
    }
}
