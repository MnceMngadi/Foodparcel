package com.foodparcel.entity.employee;

public class Scheduler extends Employee {

    public Scheduler() {
    }

    public Scheduler(Builder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "Scheduler{} " + super.toString();
    }

    public static class SchedulerBuilder extends Employee.Builder{

        public SchedulerBuilder copy(Scheduler scheduler){
            super.setEmployeeNumber(scheduler.getEmployeeNumber());
            super.setIdentityNumber(scheduler.getIdentityNumber());
            super.setFirstName(scheduler.getFirstName());
            super.setLastName(scheduler.getLastName());
            super.setJobTitle(scheduler.getJobTitle());
            super.setEmploymentDate(scheduler.getEmploymentDate());
            return this;
        }

        @Override
        public Employee build() {
            return new Scheduler(this);
        }
    }
}
