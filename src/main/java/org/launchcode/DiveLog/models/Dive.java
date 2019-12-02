package org.launchcode.DiveLog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dive {

    @Id
    @GeneratedValue
    private int id;


}
