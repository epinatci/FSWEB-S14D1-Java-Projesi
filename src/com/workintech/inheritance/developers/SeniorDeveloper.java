package com.workintech.inheritance.developers;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(50000);
        System.out.println(super.getName()+" senior developer begins to work");
    }
}
