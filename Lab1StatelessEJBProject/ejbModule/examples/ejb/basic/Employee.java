package examples.ejb.basic;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Employee
 */
@Stateless
@LocalBean
public class Employee implements EmployeeRemote, EmployeeLocal {

    /**
     * Default constructor. 
     */
    //New comment not in branch
    public Employee() {
        // TODO Auto-generated constructor stub
    }

}
