package oop.exercise;

public class Person {
    private String name;

    //constructor- sets the rules for how you create a new object. like if you're creating a new person, they need to
    // have a name since thats the rule set here.
    public Person(String aName){
        //this.name = aName; also works
        setName(aName);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String aName){
        this.name = aName;
    }

    public void sayHello(){
        System.out.println("Hello from " + getName());
    }

    public static void main(String[] args){
        Person evelyn = new Person("Evelyn");
        evelyn.sayHello();
    }
}

