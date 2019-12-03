package org.launchcode.DiveLog.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Dive {

    @Id
    @GeneratedValue
    private int id;


    @NotNull
    private String fish;


    private Date date;

    public Dive(String fish, Date date ){
        this.fish = fish;
        this.date = date;
        }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }
    public Date getDate() {
        return date;}

   public void setDate(Date date) {
        this.date = date;}

}
