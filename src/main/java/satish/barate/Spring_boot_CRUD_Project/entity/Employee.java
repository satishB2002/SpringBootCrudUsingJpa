package satish.barate.Spring_boot_CRUD_Project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Employee")
public class Employee {
	@Id
private int employee_id;
	@Column
private String employee_name;
	@Column
private String employee_salary;
public Employee () {}
public Employee(int employee_id, String employee_name, String employee_salary) {
	super();
	this.employee_id = employee_id;
	this.employee_name = employee_name;
	this.employee_salary = employee_salary;
}
public int getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}
public String getEmployee_name() {
	return employee_name;
}
public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}
public String getEmployee_salary() {
	return employee_salary;
}
public void setEmployee_salary(String employee_salary) {
	this.employee_salary = employee_salary;
}

}
