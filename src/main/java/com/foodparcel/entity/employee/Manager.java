package com.foodparcel.entity.employee;

public class Manager extends Employee {
    private String department;

    public Manager() {
    }

    public Manager(ManagerBuilder builder){
        super(builder);
        this.department = builder.department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }

    public static class ManagerBuilder extends Employee.Builder{
        private String department;

        public ManagerBuilder(String department) {
            super();
            this.department = department;
        }

        public ManagerBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public ManagerBuilder copy(Manager manager){
            super.setEmployeeNumber(manager.getEmployeeNumber());
            super.setIdentityNumber(manager.getIdentityNumber());
            super.setFirstName(manager.getFirstName());
            super.setLastName(manager.getLastName());
            super.setJobTitle(manager.getJobTitle());
            super.setEmploymentDate(manager.getEmploymentDate());
            this.department = manager.getDepartment();
            return this;
        }

        @Override
        public Employee build(){
            return new Manager(this);
        }

    }
}
