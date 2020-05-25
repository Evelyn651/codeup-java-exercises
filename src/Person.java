public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

//    public void sayHello(){
//        System.out.println("Hello from " + name);
//    }
    public static String race = "HUMAN RACE";

    // Creating fields
    private String firstName;
    protected boolean isAlive;
    private String lastName;

    // Creating rules in order to create an instance
    // Everybody should have a First Name, Last Name and a value to know if they are alive
    public Person(String fn, String ln, boolean isAlive){
        this.firstName = fn;
        this.lastName = ln;
        this.isAlive = isAlive;
    }

    public String sayHello(){
        if(this.isAlive){
            return String.format("Hello from %s %s!", this.firstName, this.lastName);
        } else {
            return "This person is not alive anymore :(";
        }
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }
}

