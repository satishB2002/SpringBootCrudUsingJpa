package satish.barate.Spring_boot_CRUD_Project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import satish.barate.Spring_boot_CRUD_Project.entity.Employee;

public interface EmployeeDAO  extends JpaRepository<Employee, Integer> {


}
