package Test;

import DAO.IStudenteDAO;
import DAO.StudenteDAO;
import Model.Studente;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class StudenteDAOTest {
    @Before
    public void setUp() {
        IStudenteDAO studenteDAO = StudenteDAO.getInstance();
        Studente studente = new Studente();
        studente.setNome("Giuseppe");
        studente.setCognome("Verdi");
        studente.setMatricola("11112222");
        studente.setEmail("giuseppe.verdi@gmail.com");
        studente.setTelefono("3356614327");
        studenteDAO.add(studente);
    }

    @After
    public void tearDown() {
        IStudenteDAO studenteDAO = StudenteDAO.getInstance();
        studenteDAO.removeById("11112222");
    }

    @Test
    public void findByIdReturnsStudentWhenMatricolaExists() {
        IStudenteDAO studenteDAO = StudenteDAO.getInstance();
        Studente studente = studenteDAO.findById("11112222");
        Assert.assertNotNull(studente);
        Assert.assertEquals("Giuseppe", studente.getNome());
        Assert.assertEquals("Verdi", studente.getCognome());
        Assert.assertEquals("11112222", studente.getMatricola());
        Assert.assertEquals("giuseppe.verdi@gmail.com", studente.getEmail());
        Assert.assertEquals("3356614327", studente.getTelefono());
    }

    @Test
    public void findByIdReturnsNullWhenMatricolaDoesNotExist() {
        IStudenteDAO studenteDAO = StudenteDAO.getInstance();
        Studente studente = studenteDAO.findById("00000000");
        Assert.assertNull(studente);
    }

    @Test
    public void findAllReturnsAllStudents() {
        IStudenteDAO studenteDAO = StudenteDAO.getInstance();
        List<Studente> studenti = studenteDAO.findAll();
        Assert.assertTrue(studenti.size() >= 1);
        Assert.assertTrue(studenti.stream().anyMatch(studente -> "11112222".equals(studente.getMatricola())));
    }

    @Test
    public void addPersistsStudentWithAllFields() {
        IStudenteDAO studenteDAO = StudenteDAO.getInstance();
        Studente studente = new Studente();
        studente.setNome("Maria");
        studente.setCognome("Rossi");
        studente.setMatricola("22223333");
        studente.setEmail("maria.rossi@gmail.com");
        studente.setTelefono("3334445555");

        int affectedRows = studenteDAO.add(studente);
        Assert.assertTrue(affectedRows >= 0);

        Studente savedStudent = studenteDAO.findById("22223333");
        Assert.assertNotNull(savedStudent);
        Assert.assertEquals("Maria", savedStudent.getNome());
        Assert.assertEquals("Rossi", savedStudent.getCognome());
        Assert.assertEquals("maria.rossi@gmail.com", savedStudent.getEmail());
        Assert.assertEquals("3334445555", savedStudent.getTelefono());

        studenteDAO.removeById("22223333");
    }

    @Test
    public void removeByIdDeletesStudentWhenMatricolaExists() {
        IStudenteDAO studenteDAO = StudenteDAO.getInstance();
        int affectedRows = studenteDAO.removeById("11112222");
        Assert.assertTrue(affectedRows >= 0);
        Assert.assertNull(studenteDAO.findById("11112222"));
    }

    @Test
    public void removeByIdDoesNothingWhenMatricolaDoesNotExist() {
        IStudenteDAO studenteDAO = StudenteDAO.getInstance();
        int affectedRows = studenteDAO.removeById("99999999");
        Assert.assertTrue(affectedRows >= 0);
        Assert.assertNull(studenteDAO.findById("99999999"));
    }

    @Test
    public void updateChangesStudentData() {
        IStudenteDAO studenteDAO = StudenteDAO.getInstance();
        Studente studente = studenteDAO.findById("11112222");
        studente.setEmail("giuseppe.verdi@studenti.unisalento.it");
        studente.setTelefono("1112223334");
        studenteDAO.update(studente);

        studente = studenteDAO.findById("11112222");
        Assert.assertNotNull(studente);
        Assert.assertEquals("giuseppe.verdi@studenti.unisalento.it", studente.getEmail());
        Assert.assertEquals("1112223334", studente.getTelefono());
    }
}
