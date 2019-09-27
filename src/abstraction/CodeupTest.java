package abstraction;

public class CodeupTest {

    public static void main(String[] args) {
        // ERROR!
        // Employee tim = new Employee();
// okay
        Employee[] employees = new Employee[2];

        Employee bob = new Accountant();
        Dev fer = new Dev();
        BackEndDev viv  = new BackEndDev();

        fer.setSalary(2);
        bob.setSalary(3);

        fer.debug("bug");
        viv.fixDB();

        employees[0] = bob;
        employees[1] = fer;

        // 9 - 5 everybody is working
        for (Employee emp : employees) {
            System.out.println(emp.work());
            System.out.println("Pay $" + emp.getSalary());
        }




    }
}
