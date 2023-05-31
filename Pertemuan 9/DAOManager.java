/**
 * File      : DAOManager.java		31/05/23
 * Penulis   : Varrel / 24060121130062
 * Deskripsi : pengelola DAO dalam program
 *
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
