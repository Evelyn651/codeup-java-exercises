package CodecademyJavaPractice;

import jdk.swing.interop.SwingInterOpUtils;

public class Hashtag {
    public static void main(String[] args){
        String hashtag = "#100DaysOfCode";
        System.out.println("Lowercase: " + hashtag.toLowerCase());
        System.out.println("Uppercase: " + hashtag.toUpperCase());

        String thorin = "Thorin Son of Oakenshield";
        System.out.println(thorin.toUpperCase());

        String jrr = "IF MORE OF US VALUED FOOD AND CHEER AND SONG ABOVE HOARDED GOLD, IT WOULD BE A MERRIER WORLD.";
        System.out.println(jrr.toLowerCase());
    }
}
