package com.java.oops;

public class Employee {

    String name;
    int age;
    String job;
    double hourlySalary;

    //1. const name = class name
    //2. no return type for constructors

    Employee( double hourlySalary){
        this.hourlySalary = hourlySalary;
    }

    Employee(){

    }

    Employee(String name, int age, String job, double hourlySalary){
        this.name = name;
        this.age = age;
        this.hourlySalary = hourlySalary;
        this.job = job;
    }

    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setJob(String job){
        this.job = job;
    }
    void setHourlySalary(double hourlySalary){
        this.hourlySalary = hourlySalary;
    }

    String getJobDescription(){
        String des = "";
        if(job.equals("dev")){
            des = "I'm a full time full stack developer";
        }
        else if(job.equals("test")){
            des = "I'm a QA engineer";
        }
        else if(job.equals("manager")){
            des = "I'm a lead, who leads a team contains 50 folks";
        }
        else{
            des = "invalid job entered!";
        }
        return des;
    }

    double getSalary(int hours){
        return hours * this.hourlySalary;
    }

    String getEmployeeInfo(){
        return "name: " + this.name + "\n" + "age :  "+ this.age;
    }
}
