package satish.barate.Spring_boot_CRUD_Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import satish.barate.Spring_boot_CRUD_Project.dao.EmployeeDAO;
import satish.barate.Spring_boot_CRUD_Project.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO dao;
public String addEmployee(Employee employee)
{
	dao.save(employee);
	return "New Employee Has Been Added In Database , Id number"+employee.getEmployee_id();
	
	
}
public String addEmployees(List<Employee> employees)
{
	dao.saveAll(employees);
	return " All New Employees Has Been Added In Database";
	
}
public String updateEmployee(Employee employee)
{
	dao.save(employee);
	return "Employee Id is Updated"+employee.getEmployee_id();
	
}
public Employee getEmployee(int employee_id)
{
	return dao.findById(employee_id).get();
}

public String deleteEmployee(int employee_id)
{
	
	Employee employee=dao.findById(employee_id).get();
	
	dao.delete(employee);
	return "Roll number is deleted:"+employee_id;
}
public Iterable<Employee> listAll()
{
	return this.dao.findAll();
}
public List<Employee> getAllEmployees() {
    return dao.findAll();
}
public List<Employee> findallStudents()
{
	return (List<Employee>) dao.findAll();
}

}
