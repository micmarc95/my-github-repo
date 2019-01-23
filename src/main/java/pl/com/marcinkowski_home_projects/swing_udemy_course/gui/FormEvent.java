package pl.com.marcinkowski_home_projects.swing_udemy_course.gui;

import java.util.EventObject;

public class FormEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */

    private String name;
    private String occupation;
    private int ageCategory;
    private  String empCat;
    private String taxID;
    private boolean usCitizen;
    private String gender;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String name, String occupation, int ageCat, String empCat, String taxID, boolean usCitizen, String gender) {
        super(source);

        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCat;
        this.empCat = empCat;
        this.taxID = taxID;
        this.usCitizen = usCitizen;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAgeCategory(){
        return ageCategory;
    }

    public String getEmploymentCategory (){ return empCat;}
    public String getTaxID (){ return taxID;}
    public String getGender (){ return gender;}
    public boolean isusCitizen (){ return usCitizen;}
}
