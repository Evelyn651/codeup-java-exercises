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
        ArrayList<String> sherlocksToDos = new ArrayList<>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        //Poirot's to-do list
        ArrayList<String> poirotsToDos = new ArrayList<>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all the suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        //changing elements in the arraylist
        sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
        poirotsToDos.set(3, "listen to Captain Hastings for amusement");
        System.out.println("Sherlock's to-do list: " + sherlocksToDos.toString() + "\n");
        System.out.println("Poirot's to-do list: " + poirotsToDos.toString() + "\n");

        //deleting - removing elements from arraylists
        sherlocksToDos.remove("visit the crime scene");
        sherlocksToDos.remove("play violin");
        poirotsToDos.remove("visit the crime scene");
        System.out.println("New Sherlock to dos " + sherlocksToDos + "\n");
        System.out.println("New Poirot to dos " + poirotsToDos + "\n");

        //finding out how many things are left to do before "solve the case"
        System.out.println("There are " + sherlocksToDos.indexOf("solve the case") + " things to do before solving " +
                        "the case");

        //printing out the size of each array list
        System.out.println("Sherlock has " + sherlocksToDos.size() + " to dos.");
        System.out.println("Poirot has " + poirotsToDos.size() + " to dos.");

        //the detective with the most to-dos
        System.out.println("Poirot has the most todos.");

        //accessing the elements of the arraylist
        System.out.println("Sherlock's third to-do is: " + sherlocksToDos.get(2));
        System.out.println("Poirot's second to-do is: " + poirotsToDos.get(1));

    }
}
