package org.petya8bachey.domain;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public Employee create(String fullName, String address, Department departmentAffiliation, String birthdate, String position) {
        Employee employee = new Employee();
        employee.setFullName(fullName);
        employee.setAddress(address);
        employee.setDepartmentAffiliation(departmentAffiliation);
        employee.setBirthdate(birthdate);
        employee.setPosition(position);
        employeeList.add(employee);
        return employee;
    }

    @Override
    public void delete(Employee employee) {
        Iterator<Employee> iterator = employeeList.iterator();
        while(iterator.hasNext()){
            if (iterator.next() == employee)
                iterator.remove();
        }
    }

    @Override
    public Employee find(long ID) {
        for (Employee employee : employeeList) {
            if (employee.ID == ID)
                return employee;
        }
        return null;
    }

    @Override
    public Employee findOfFullName(String fullName) {
        for (Employee employee : employeeList) {
            if (employee.fullName == fullName)
                return employee;
        }
        return null;
    }

    @Override
    public Employee findOfAddress(String address) {
        for (Employee employee : employeeList) {
            if (employee.address == address)
                return employee;
        }
        return null;
    }

    @Override
    public Employee findOfDepartmentAffiliation(Department departmentAffiliation) {
        for (Employee employee : employeeList) {
            if (employee.departmentAffiliation == departmentAffiliation)
                return employee;
        }
        return null;
    }

    @Override
    public Employee findOfBirthdate(String birthdate) {
        for (Employee employee : employeeList) {
            if (employee.birthdate == birthdate)
                return employee;
        }
        return null;
    }

    @Override
    public Employee findOfPosition(String position) {
        for (Employee employee : employeeList) {
            if (employee.position == position)
                return employee;
        }
        return null;
    }

    @Override
    public List<Employee> getAll() { return employeeList; }
}
