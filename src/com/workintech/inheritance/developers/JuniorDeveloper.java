package com.workintech.inheritance.developers;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(30000);
        System.out.println(super.getName()+" junior developer begins to work");
    }
}
