package com.foodparcel.entity;

public class Volunteer {

    private boolean availability;
    private String homeLanguage= "";
    private String province = "";
    private int deliveriesMade= 0;
    private int hoursWorked = 0;


    private Volunteer(Builder volunteer){

        this.availability = volunteer.availability;
        this.homeLanguage = volunteer.homeLanguge;
        this.province = volunteer.province;
        this.deliveriesMade = volunteer.diliveriesMade;
        this.hoursWorked = volunteer.hoursWorked;

    }

    public boolean isAvailability() {
        return availability;
    }

    public String getHomeLanguage() {
        return homeLanguage;
    }

    public String getProvince() {
        return province;
    }

    public int getDeliveriesMade() {
        return deliveriesMade;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "availability=" + availability +
                ", homeLanguage='" + homeLanguage + '\'' +
                ", province='" + province + '\'' +
                ", deliveriesMade=" + deliveriesMade +
                ", hoursWorked=" + hoursWorked +
                '}';
    }

    public class Builder{

        public String homeLanguge = "", province ="";
        public boolean availability;
        public int diliveriesMade=0, hoursWorked=0;


        public Builder setHomeLanguge(String homeLanguge) {
            this.homeLanguge = homeLanguge;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setAvailability(boolean availability) {
            this.availability = availability;
            return this;
        }

        public Builder setDiliveriesMade(int diliveriesMade) {
            this.diliveriesMade = diliveriesMade;
            return this;
        }

        public Builder setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public Builder copy(Volunteer volunteer){

            this.availability = volunteer.availability;
            this.diliveriesMade = volunteer.deliveriesMade;
            this.homeLanguge = volunteer.homeLanguage;
            this.province = volunteer.province;
            this.hoursWorked = volunteer.hoursWorked;

            return this;
        }

        public Volunteer build(){

            return new Volunteer(this);
        }
    }



}
