package practice;

public class PhraseOMatic {
    public static void main(String[] args){

        //three lists of words to choose from
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based",
                "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
                "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged",
                "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        //find how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        System.out.println("oneLength = " + oneLength);
        System.out.println("twoLength = " + twoLength);
        System.out.println("threeLength = " + threeLength);

        //generate three random numbers to build a phrase with
        int num1 = (int) (Math.random() * oneLength);
        int num2 = (int) (Math.random() * twoLength);
        int num3 = (int) (Math.random() * threeLength);

        //now the structure for the phrase using the three random numbers that are generated
        String phrase = wordListOne[num1] + " " + wordListTwo[num2] + " " + wordListThree[num3];

        //print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}
