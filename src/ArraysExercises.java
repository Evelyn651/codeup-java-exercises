//import oop.exercise.Person;
//
//import java.util.Arrays;
//
//
//public class ArraysExercises {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        Person[] people = new Person[3];
//
//        people[0] = new Person("Douglas");
//        people[1] = new Person("Fernando");
//        people[2] = new Person("Christian");
//
//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i]);
//        }
//
//        people = addPerson(people, new Person("Dimitri"));
//
//        for (Person person : people) {
//            System.out.println("From an enhanced for after addPerson : person = " + person);
//        }
//    }
//
//    public Person[] addPerson(Person[] people, Person person) {
//        //Example of copying the array by hand.
////        Person[] newPeopleArray = new Person[people.length + 1];
////
////        for (int i = 0; i < people.length; i++) {
////            newPeopleArray[i] = people[i];
////        }
//        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
//
//        newPeopleArray[newPeopleArray.length - 1] = person;
//
//        return newPeopleArray;
//    }
//
//}
//
//
