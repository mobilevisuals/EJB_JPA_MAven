package pac;

import javax.ejb.Local;

/**
 *
 * @author eyvind
 */
@Local
public interface PersonHandlerLocal {

    void fillDB();

    PersonReal findByfirstName(String fname);

    boolean deletePerson(String fname, String lname);

    double calculation1();

    double research1();

    boolean changeName(String firstName,String newFirstName);



}