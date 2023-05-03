package org.petya8bachey.application;

import org.petya8bachey.domain.Department;
import org.petya8bachey.domain.Employee;
public interface ApplicationService {
    void createEmployee(String fullName, String address, Department departmentAffiliation, String birthdate, String position);
    Employee findEmployee(Object value, String field);
    void deleteEmployee(Employee employee);
    void createDepartment(String name, int numberOfEmployees, String listOfRooms);
    Department findDepartment(Object value, String field);
    void deleteDepartment(Department department);
}
