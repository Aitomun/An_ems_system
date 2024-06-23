package com.david.week_9_task.service;

import com.david.week_9_task.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee addEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Employee getEmployeeByName(String name);

    Employee findByEmail(String email);

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);

    List<Employee> getAllEmployeesBasicInfo();
}
