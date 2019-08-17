package com.qualteco.food.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;

public class Base {
    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)*/
    private int id;
    //@CreationTimestamp
    private Date creattionTime;
    //@UpdateTimestamp
    private Date lastUpdationTime;

}
