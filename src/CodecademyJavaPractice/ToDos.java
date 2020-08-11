package CodecademyJavaPractice;
import java.util.ArrayList;
public class ToDos {
    public static void main(String[] args){
        //create a to do list below
        ArrayList<String> toDoList = new ArrayList<>();

        //the todos to add to the arraylist
        String toDo1 = "water plants";
        String toDo2 = "practice coding";
        String toDo3 = "read a book";

        //adding the todos to the arraylist
        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

        System.out.println("Your to-do list: " + toDoList);

    }
}
