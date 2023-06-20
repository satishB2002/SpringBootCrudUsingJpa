package satish.barate.Spring_boot_CRUD_Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import satish.barate.Spring_boot_CRUD_Project.entity.Employee;
import satish.barate.Spring_boot_CRUD_Project.service.EmployeeService;

@RestController

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee	employee)
	{
		return employeeService.addEmployee(employee);
	}
	@PostMapping("/bulkAdd")
	public String addEmployees(@RequestBody List<Employee> employees)
	{
		return employeeService.addEmployees(employees);
	}
	@DeleteMapping("/all/{employee_id}")
	public String deleteStudent(@PathVariable int employee_id)
	{
			return employeeService.deleteEmployee(employee_id);
	}
	@PutMapping("/add")
	public String updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}
	@RequestMapping("/all/{employee_id}")
	public Employee getEmployee(@PathVariable int employee_id)
	{
		return employeeService.getEmployee(employee_id);
		
	}
	@GetMapping("/showAll")
	public Iterable<Employee>getEmployee()
	{
		return employeeService.getAllEmployees();
		
	}
//	@RequestMapping
//	@GetMapping("/employees")
//	public List<Employee> getAllEmployees() {
//	    return employeeService.getAllEmployees();
//	}
//	@GetMapping("/getAllStudents")
//	public List<Employee> findAllStudent()
//	{
//		return employeeService.findallStudents();
//		
//	}
	
}
