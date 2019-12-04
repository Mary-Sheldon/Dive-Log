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

    @NotNull
    private int time1;

    private Date date;

    @NotNull
    private int time2;

    @NotNull
    private int psi1;

    @NotNull
    private int psi2;

    @NotNull
    private String depth;



    @NotNull
    private String visibility;

    @NotNull
    private int nitrogn1;

    @NotNull
    private int nitrogn2;

    @NotNull
    private int safteystopdur;

    @NotNull
    private int surfaceinterval;

    @NotNull
    private int surfacetemp;

    @NotNull
    private int airtemp;

    @NotNull
    private int bottomtemp;

    @NotNull
    private String divetype;

    @NotNull
    private String watertype;


    @NotNull
    private String booties;

    @NotNull
    private String full;

    @NotNull
    private String shorty;

    @NotNull
    private String skin;

    @NotNull
    private String weight;

    @NotNull
    private String buddy;

    @NotNull
    private  String notes;



    public Dive(String fish, Date date, int time1, int time2, int psi1, int psi2, String depth, String visibility, int nitrogen1, int nitrogen2,
    int safteystopdur, int surfaceinterval, int surfacetemp, int airtemp, int bottomtemp, String divetype, String watertype, String booties, String full,
                String shorty, String skin, String weight, String buddy, String notes){
        this.fish = fish;
        this.date = date;
        this.time1 = time1;
        this.time2 = time2;
        this.psi1 = psi1;
        this.psi2 = psi2;
        this.depth = depth;
        this.visibility = visibility;
        this.nitrogn1 = nitrogen1;
        this.nitrogn2 = nitrogen2;
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

    public int getTime1() {
        return time1;
    }

    public void setTime1(int time1) {
        this.time1 = time1;
    }
    public int getTime2() {
        return time2;
    }

    public void setTime2(int time2) {
        this.time2 = time2;
    }

    public int getPsi1() {
        return psi1;
    }

    public void setPsi1(int psi1) {
        this.psi1 = psi1;
    }

    public int getPsi2() {
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

    public int getNitrogn1() {
        return nitrogn1;
    }

    public void setNitrogn1(int nitrogn1) {
        this.nitrogn1 = nitrogn1;
    }

    public int getNitrogn2() {
        return nitrogn2;
    }

    public void setNitrogn2(int nitrogn2) {
        this.nitrogn2 = nitrogn2;
    }

    public int getSafteystopdur() {
        return safteystopdur;
    }

    public void setSafteystopdur(int safteystopdur) {
        this.safteystopdur = safteystopdur;
    }

    public int getSurfaceinterval() {
        return surfaceinterval;
    }

    public void setSurfaceinterval(int surfaceinterval) {
        this.surfaceinterval = surfaceinterval;
    }

    public int getSurfacetemp() {
        return surfacetemp;
    }

    public void setSurfacetemp(int surfacetemp) {
        this.surfacetemp = surfacetemp;
    }

    public int getAirtemp() {
        return airtemp;
    }

    public void setAirtemp(int airtemp) {
        this.airtemp = airtemp;
    }

    public int getBottomtemp() {
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

}
