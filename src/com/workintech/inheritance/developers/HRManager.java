package com.workintech.inheritance.developers;

import java.util.Arrays;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;


    public HRManager(long id, String name,JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors ) {
        super(id, name);
        this.juniors=juniors;
        this.mids=mids;
        this.seniors=seniors;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
       try {
           if(juniors[index] == null){
               juniors[index] = juniorDeveloper;
           }else {
               System.out.println("Index is full");
           }
       }
       catch (ArrayIndexOutOfBoundsException exception){
           exception.printStackTrace();
           System.out.println("Index not found: " + exception.getMessage());
       }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try {
            if(mids[index] == null){
                mids[index] = midDeveloper;
            }else {
                System.out.println("Index is full");
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + exception.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {
            if(seniors[index] == null){
                seniors[index] = seniorDeveloper;
            }else {
                System.out.println("Index is full");
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + exception.getMessage());
        }
    }
    public void work() {
        super.setSalary(45000);
        System.out.println(super.getName()+" hr manager begins to work");
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniors=" + Arrays.toString(juniors) +
                ", mids=" + Arrays.toString(mids) +
                ", seniors=" + Arrays.toString(seniors) +
                '}';
    }
}
