package practice;

public class Hobbits {
    String name;

    public static void main(String[] args){

        Hobbits[] hobbit = new Hobbits[3];
        int z = 0;

        while (z < 2){ //it only prints out with the length of 2, 3 is considered out of bounds.
            z = z + 1;
            hobbit[z] = new Hobbits();
            hobbit[z].name = "bilbo";
            if(z == 1){
                hobbit[z].name = "frodo";
            }
            if(z == 2){
                hobbit[z].name = "sam";
            }

            System.out.println(hobbit[z].name + " is a good Hobbit name");
            //why isnt it also printing out bilbo?
        }
    }
}
