package oop;

public class Person {
    private String name;

    public Person(String name){
        setName(name);
//        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + this.getName());
    }


}
