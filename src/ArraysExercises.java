import oop.exercise.Person;

import java.sql.Array;

public class ArraysExercises {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        //System.out.println(Array.toString);

        Person[] people = new Person[3];

        people[0] = new Person("evelyn");
        people[1] = new Person("wendy");
        people[2] = new Person("michael");

//        for (int i = 0; i < people.length; i++){
//            System.out.println(people[i].sayHello());
//        }

        for (Person person : people){
            System.out.println("From enhanced for loop: " + person.toString());
        }
    }
}
