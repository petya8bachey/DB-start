package org.petya8bachey.domain;

import lombok.Setter;
import org.springframework.stereotype.Component;

import static org.petya8bachey.domain.ID.genID;

@Component @Setter
public class Department {
    protected long ID;
    protected String name;
    protected int numberOfEmployees;
    protected String listOfRooms;

    protected Department() {
        ID = genID();
    }

    @Override
    public String toString() {
        return String.format("Department\nID: %d\nName: %s\nNumber of employees: %d\nList of rooms: %s",
                ID, name, numberOfEmployees, listOfRooms);
    }
}
