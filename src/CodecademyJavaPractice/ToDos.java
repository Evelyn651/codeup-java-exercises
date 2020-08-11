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

        //Sherlock Holmes' to-do list
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        //Piorot's to-do list
        ArrayList<String> poirotsToDos = new ArrayList<>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all the suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        //printing out the size of each array list
        System.out.println("Sherlock has " + sherlocksToDos.size() + " to dos.");
        System.out.println("Poirot has " + poirotsToDos.size() + " to dos.");

        //the detective with the most to-dos
        System.out.println("Poirot has the most todos.");

    }
}
