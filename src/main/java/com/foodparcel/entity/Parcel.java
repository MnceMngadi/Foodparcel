package com.foodparcel.entity;

public class Parcel {

    private int parcelNum;

    private Parcel(Builder builder){
        this.parcelNum = builder.parcelNum;
    }

    public int getParcelNum() {
        return parcelNum;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "parcelNum=" + parcelNum +
                '}';
    }

    public static class Builder{
        private int parcelNum;
        public Builder setParcelNum(int parcelNum) {
            this.parcelNum = parcelNum;
            return this;
        }

        public Builder copy(Parcel parcel){
            this.parcelNum = parcel.parcelNum;
            return this;
        }
        public Parcel build(){
            return new Parcel(this);
        }

    }



}
