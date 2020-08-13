package CodecademyJavaPractice;

import java.util.ArrayList;

public class CalculateTotal {
    public static void main(String[] args){

        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0;
        double mostExpensive = 0;

        //to iterate over the arraylist for total
        for(int i = 0; i < expenses.size(); i++){
            total += expenses.get(i);
        }
        System.out.println("Total expenses: $" + total);

        //using enhanced for loop to go through each index of arraylist
        for(double expense : expenses){
            if(expense > mostExpensive){
                mostExpensive = expense;
            }
        }
        System.out.println(mostExpensive);

//        int commits = 0;
//
//        while(commits < 10) {
//            commits++;
//            System.out.println("You need to make some commits!");
//        }
    }
}
