package com.workintech.inheritance.developers;

public class CompanyMain {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1, "Pinar");
        JuniorDeveloper juniorDeveloper2= new JuniorDeveloper(2, "Elif");
        juniorDeveloper1.work();
        juniorDeveloper2.work();

        SeniorDeveloper seniorDeveloper3 = new SeniorDeveloper(3, "Gülsu");
        SeniorDeveloper seniorDeveloper4 = new SeniorDeveloper(4, "Bilge");
        seniorDeveloper3.work();
        seniorDeveloper4.work();

        MidDeveloper midDeveloper5 = new MidDeveloper(5, "Gülin");
        midDeveloper5.work();
        System.out.println(midDeveloper5.getSalary());

        HRManager hrManager = new HRManager(1, "Dogancan", new JuniorDeveloper[2],new MidDeveloper[5], new SeniorDeveloper[3]);
        hrManager.work();

        hrManager.addEmployee(0,juniorDeveloper1);
        System.out.println(hrManager);

    }
}
