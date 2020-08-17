package CodecademyJavaPractice.InheritancePractice;

public class Noodle {
   protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr){
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public void cook(){
        this.texture = "cooked";
    }

    final public boolean isTasty(){
        return true;
    }

    public static void main(String[] args){
        Spaghetti spaghettiPomodoro = new Spaghetti();
        System.out.println(spaghettiPomodoro.texture);

        Pho phoChay = new Pho();
        System.out.println(phoChay.shape);

        Ramen yasaiRamen = new Ramen();
        System.out.println(yasaiRamen.ingredients);
        System.out.println(yasaiRamen.isTasty());
    }

}

//Polymorphism allows a child class to share the information and behavior of its parent class while also
// incorporating its own functionality.