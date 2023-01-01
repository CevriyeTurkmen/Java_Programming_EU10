package day43_Abstraction.employee;

public final class Tester extends employee{


    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours");
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing the application");
    }

    public void bugreport(){
        System.out.println(getName()+ " is creating bug report");

    }



}
