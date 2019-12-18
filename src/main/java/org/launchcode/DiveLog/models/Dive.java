package org.launchcode.DiveLog.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.tools.javac.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Dive {

    @ManyToOne
    private User user;

    public int getId() {
        return id;
    }

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, max=20)
    private String fish;

    @NotNull
    private Integer time1;

    @NotNull
    @Size(min=10, max=10, message= "Enter the date MM/DD/YYYY")
    private String ate;

    @NotNull
    private Integer time2;

    @NotNull
    private Integer psi1;

    @NotNull
    private Integer psi2;

    @NotNull
    @Size(min=1, max=5, message = "Please enter depth")
    private String depth;

    @NotNull
    @Size(min=1, max=20, message = "Please enter visibility")
    private String visibility;

    @NotNull
    private Integer nitrogen1;

    @NotNull
    private Integer nitrogen2;

    @NotNull
    private Integer safteystopdur;

    @NotNull
    private Integer surfaceinterval;

    @NotNull
    private Integer surfacetemp;

    @NotNull
    private Integer airtemp;

    @NotNull
    private Integer bottomtemp;

    @NotNull
    @Size(min=1, max=20)
    private String divetype;

    @NotNull
    @Size(min=1, max=20)
    private String watertype;


    @NotNull
    @Size(min=1, max=20)
    private String booties;

    @NotNull
    @Size(min=1, max=20)
    private String full;

    @NotNull
    @Size(min=1, max=20)
    private String shorty;

    @NotNull
    @Size(min=1, max=20)
    private String skin;

    @NotNull
    @Size(min=1, max=20)
    private String weight;

    @NotNull
    @Size(min=1, max=20, message = "Name must be between 3 and 20 characters")
    private String buddy;

    @NotNull
    @Size(min=1, max=1000, message = "Notes up to 1,000 characters")
    private  String notes;



    public Dive(String fish, String ate, Integer time1, Integer time2, Integer psi1, Integer psi2, String depth, String visibility, Integer nitrogen1, Integer nitrogen2,
                Integer safteystopdur, Integer surfaceinterval, Integer surfacetemp, Integer airtemp, Integer bottomtemp, String divetype, String watertype, String booties, String full,
                String shorty, String skin, String weight, String buddy, String notes){
        this.fish = fish;
        this.ate = ate;
        this.time1 = time1;
        this.time2 = time2;
        this.psi1 = psi1;
        this.psi2 = psi2;
        this.depth = depth;
        this.visibility = visibility;
        this.nitrogen1 = nitrogen1;
        this.nitrogen2 = nitrogen2;
        this.safteystopdur = safteystopdur;
        this.surfaceinterval = surfaceinterval;
        this.surfacetemp = surfacetemp;
        this.airtemp = airtemp;
        this.bottomtemp = bottomtemp;
        this.divetype = divetype;
        this.watertype = watertype;
        this.booties = booties;
        this.full = full;
        this.shorty = shorty;
        this.skin = skin;
        this.weight = weight;
        this.buddy = buddy;
        this.notes = notes;

        }

    public Dive() {

    }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }


    public Integer getTime1() {
        return time1;
    }

    public void setTime1(int time1) {
        this.time1 = time1;
    }
    public Integer getTime2() {
        return time2;
    }

    public void setTime2(int time2) {
        this.time2 = time2;
    }

    public Integer getPsi1() {
        return psi1;
    }

    public void setPsi1(int psi1) {
        this.psi1 = psi1;
    }

    public Integer getPsi2() {
        return psi2;
    }

    public void setPsi2(int psi2) {
        this.psi2 = psi2;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Integer getNitrogen1() {
        return nitrogen1;
    }

    public void setNitrogen1(int nitrogen1) {
        this.nitrogen1 = nitrogen1;
    }

    public Integer getNitrogen2() {
        return nitrogen2;
    }

    public void setNitrogen2(int nitrogen2) {
        this.nitrogen2 = nitrogen2;
    }

    public Integer getSafteystopdur() {
        return safteystopdur;
    }

    public void setSafteystopdur(int safteystopdur) {
        this.safteystopdur = safteystopdur;
    }

    public Integer getSurfaceinterval() {
        return surfaceinterval;
    }

    public void setSurfaceinterval(int surfaceinterval) {
        this.surfaceinterval = surfaceinterval;
    }

    public Integer getSurfacetemp() {
        return surfacetemp;
    }

    public void setSurfacetemp(int surfacetemp) {
        this.surfacetemp = surfacetemp;
    }

    public Integer getAirtemp() {
        return airtemp;
    }

    public void setAirtemp(int airtemp) {
        this.airtemp = airtemp;
    }

    public Integer getBottomtemp() {
        return bottomtemp;
    }

    public void setBottomtemp(int bottomtemp) {
        this.bottomtemp = bottomtemp;
    }
    public String getDivetype() {
        return divetype;
    }

    public void setDivetype(String divetype) {
        this.divetype = divetype;
    }

    public String getWatertype() {
        return watertype;
    }

    public void setWatertype(String watertype) {
        this.watertype = watertype;
    }

    public String getBooties() {
        return booties;
    }

    public void setBooties(String booties) {
        this.booties = booties;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getShorty() {
        return shorty;
    }

    public void setShorty(String shorty) {
        this.shorty = shorty;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBuddy() {
        return buddy;
    }

    public void setBuddy(String buddy) {
        this.buddy = buddy;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAte() {
        return ate;
    }

    public void setAte(String ate) {
        this.ate = ate;
    }


}
