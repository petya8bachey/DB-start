package org.petya8bachey.application;

import org.petya8bachey.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    DepartmentRepository departments;
    @Autowired
    EmployeeRepository employees;


    @Transactional @Override
    public void createEmployee(String fullName, String address, Department departmentAffiliation, String birthdate, String position) {
        employees.create(fullName, address, departmentAffiliation, birthdate,position);
    }

    @Transactional @Override
    public Employee findEmployee(Object value, String field) {
        return switch (field) {
            case "ID" -> employees.find((long) value);
            case "fullName" -> employees.findOfFullName((String) value);
            case "address" -> employees.findOfAddress((String) value);
            case "departmentAffiliation" -> employees.findOfDepartmentAffiliation((Department) value);
            case "birthdate" -> employees.findOfBirthdate((String) value);
            case "position" -> employees.findOfPosition((String) value);
            default -> null;
        };
    }

    @Transactional @Override
    public void deleteEmployee(Employee employee) {
        employees.delete(employee);
    }

    @Transactional @Override
    public void createDepartment(String name, int numberOfEmployees, String listOfRooms) {
        departments.create(name, numberOfEmployees, listOfRooms);
    }

    @Transactional @Override
    public Department findDepartment(Object value, String field) {
        return switch (field) {
            case "ID" -> departments.find((long) value);
            case "name" -> departments.findOfName((String) value);
            case "numberOfEmployees" -> departments.findOfNumberOfEmployees((int) value);
            case "listOfRooms" -> departments.findOfListOfRooms((String) value);
            default -> null;
        };
    }

    @Transactional @Override
    public void deleteDepartment(Department department) {
        departments.delete(department);
    }
}
