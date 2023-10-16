package com.workintech.inheritance.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(40000);
        System.out.println(super.getName()+" mid developer begins to work");
    }
}