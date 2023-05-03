package org.petya8bachey.domain;

import java.util.List;

public interface EmployeeRepository {
    Employee create(String fullName, String address, Department departmentAffiliation, String birthdate, String position);
    void delete(Employee employee);
    Employee find(long ID);

    Employee findOfFullName(String fullName);
    Employee findOfAddress(String address);
    Employee findOfDepartmentAffiliation(Department departmentAffiliation);
    Employee  findOfBirthdate(String birthdate);

    Employee findOfPosition(String position);
    List<Employee> getAll();
}
