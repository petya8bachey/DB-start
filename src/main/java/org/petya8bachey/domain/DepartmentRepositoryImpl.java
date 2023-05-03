package org.petya8bachey.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {

    ArrayList<Department> departmentList = new ArrayList<Department>();
    @Override
    public Department create(String name, int numberOfEmployees, String listOfRooms) {
        Department department = new Department();
        department.setName(name);
        department.setNumberOfEmployees(numberOfEmployees);
        department.setListOfRooms(listOfRooms);
        departmentList.add(department);
        return department;
    }

    @Override
    public void delete(Department department) {
        Iterator<Department> iterator = departmentList.iterator();
        while(iterator.hasNext()){
            if (iterator.next() == department)
                iterator.remove();
        }
    }

    @Override
    public Department find(long ID) {
        for (Department department:departmentList) {
            if (department.ID == ID)
                return department;
        }
        return null;
    }

    @Override
    public Department findOfName(String name) {
        for (Department department:departmentList) {
            if (department.name == name)
                return department;
        }
        return null;
    }

    @Override
    public Department findOfNumberOfEmployees(int numberOfEmployees) {
        for (Department department:departmentList) {
            if (department.numberOfEmployees == numberOfEmployees)
                return department;
        }
        return null;
    }

    @Override
    public Department findOfListOfRooms(String listOfRooms) {
        for (Department department:departmentList) {
            if (department.listOfRooms == listOfRooms)
                return department;
        }
        return null;
    }


    @Override
    public List<Department> getAll() { return departmentList; }
}
