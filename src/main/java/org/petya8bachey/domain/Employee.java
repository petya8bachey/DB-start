package org.petya8bachey.domain;

import lombok.Setter;
import org.springframework.stereotype.Component;

import static org.petya8bachey.domain.ID.genID;

@Component @Setter
public class Employee {
    protected long ID;
    protected String fullName;
    protected String address;
    protected Department departmentAffiliation;
    protected String birthdate;
    protected String position;
    protected Employee() {
        ID = genID();
    }

    @Override
    public String toString() {
        return String.format("Employee\nID: %d\nFull name: %s\nAddress:  %s\nDepartment: %s\nBirthdate:  %s\nPosition: %s",
                ID, fullName, address, departmentAffiliation.name, birthdate, position);
    }
}
