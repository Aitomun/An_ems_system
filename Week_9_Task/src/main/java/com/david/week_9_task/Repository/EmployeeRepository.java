package com.david.week_9_task.Repository;

import com.david.week_9_task.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByEmail(String email);

}
