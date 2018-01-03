package examples.ejb.basic;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Employee
 */
@Stateless
@LocalBean
public class Employee implements EmployeeRemote, EmployeeLocal {
	private String name;
	private String address;
	
    /**
     * Default constructor. 
     */
    //New comment not in branch
	//Another new commnent - should appear in dev
    public Employee() {
        // TODO Auto-generated constructor stub
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    
}
