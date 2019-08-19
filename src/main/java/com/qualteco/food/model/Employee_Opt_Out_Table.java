/*
package com.qualteco.food.model;

import javax.persistence.*;
import java.sql.Date;

//@Entity
public class Employee_Opt_Out_Table {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //TODO mapping
 */
/*   @OneToOne
    @MapsId*//*

    private Employee employee;

    private Date optOutFrom;
    private Date OptOutTo;


    public Employee_Opt_Out_Table() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getOptOutFrom() {
        return optOutFrom;
    }

    public void setOptOutFrom(Date optOutFrom) {
        this.optOutFrom = optOutFrom;
    }

    public Date getOptOutTo() {
        return OptOutTo;
    }

    public void setOptOutTo(Date optOutTo) {
        OptOutTo = optOutTo;
    }


}
*/
