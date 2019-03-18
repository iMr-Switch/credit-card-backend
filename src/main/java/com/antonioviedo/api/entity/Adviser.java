package com.antonioviedo.api.entity;

public class Adviser {
    public Integer id;
    public String name;
    public String speciality;

    public void setAdviserId(Integer adviserId) {
        this.id = adviserId;
    }

    public void setAdviserName(String adviserName) {
        this.name = adviserName;
    }

    public void setAdviserSpeciality(String adviserSpeciality) {
        this.speciality = adviserSpeciality;
    }
}


