package com.foodparcel.entity.employee;

public abstract class Employee {
    private String employeeNumber, identityNumber, firstName, lastName,  employmentDate;
    private Job jobTitle;

    public Employee() {}

    public Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.identityNumber = builder.identityNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.jobTitle = builder.jobTitle;
        this.employmentDate = builder.employmentDate;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Job getJobTitle() {
        return jobTitle;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", identityNumber='" + identityNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employmentDate='" + employmentDate + '\'' +
                '}';
    }

    public static abstract class Builder {
        private String employeeNumber, identityNumber, firstName, lastName, employmentDate;
        private Job jobTitle;

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setIdentityNumber(String identityNumber) {
            this.identityNumber = identityNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setJobTitle(Job jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder setEmploymentDate(String employmentDate) {
            this.employmentDate = employmentDate;
            return this;
        }

        public abstract Employee build();
    }
}
