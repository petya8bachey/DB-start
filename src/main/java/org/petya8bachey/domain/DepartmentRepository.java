package org.petya8bachey.domain;

import java.util.List;

public interface DepartmentRepository {
    Department create(String name, int numberOfEmployees, String listOfRooms);
    void delete(Department department);
    Department find(long ID);
    Department findOfName(String name);
    Department findOfNumberOfEmployees(int numberOfEmployees);
    Department findOfListOfRooms(String listOfRooms);
    List<Department> getAll();
}
