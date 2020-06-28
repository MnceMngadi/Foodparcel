package com.foodparcel.entity;

public class Inventory {

    private int parcelReceived;
    private int parcelOut;


    private Inventory(Builder builder){
        this.parcelReceived = builder.parcelReceived;
        this.parcelOut = builder.parcelOut;
    }



    public int getParcelReceived() {
        return parcelReceived;
    }

    public int getParcelOut() {
        return parcelOut;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "parcelReceived=" + parcelReceived +
                ", parcelOut=" + parcelOut +
                '}';
    }


public static class Builder{
    private int parcelReceived;
    private int parcelOut;

    public Builder setParcelReceived(int parcelReceived) {
        this.parcelReceived = parcelReceived;
        return this;
    }

    public Builder setParcelOut(int parcelOut) {
        this.parcelOut = parcelOut;
        return this;
    }

    public Builder copy(Inventory inventory){
        this.parcelReceived = inventory.parcelReceived;
        this.parcelOut = inventory.parcelOut;
        return this;
    }
    public Inventory build(){
        return new Inventory(this);
    }


    }


}
