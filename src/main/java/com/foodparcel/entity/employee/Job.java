package com.foodparcel.entity.employee;

public class Job {
    private String jobTitle;

    public Job(JobBuilder jobBuilder) {
        this.jobTitle = jobBuilder.jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public static class JobBuilder{
        private String jobTitle;

        public JobBuilder(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public JobBuilder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public JobBuilder copy(Job job){
            this.jobTitle = job.jobTitle;
            return this;
        }

        public Job build(){
            return new Job(this);
        }
    }
}
