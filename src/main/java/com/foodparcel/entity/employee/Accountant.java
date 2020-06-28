package com.foodparcel.entity.employee;

public class Accountant  extends Employee{

    public Accountant(){}

    public Accountant(AccountantBuilder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "Accountant{} " + super.toString();
    }

    public static class AccountantBuilder extends Employee.Builder{

        public AccountantBuilder copy(Accountant accountant){
            super.setEmployeeNumber(accountant.getEmployeeNumber());
            super.setIdentityNumber(accountant.getIdentityNumber());
            super.setFirstName(accountant.getFirstName());
            super.setLastName(accountant.getLastName());
            super.setJobTitle(accountant.getJobTitle());
            return this;
        }

        @Override
        public Employee build(){
            return new Accountant(this);
        }
    }

}
