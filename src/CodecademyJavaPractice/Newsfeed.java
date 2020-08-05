package CodecademyJavaPractice;
import java.util.Arrays;

public class Newsfeed {
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0,0,0,0};
    String[] favoriteArticles;

    public Newsfeed(){
        favoriteArticles = new String[10];
    }

    public String[] getTopics(){
        return topics;
    }

    public String getTopTopic(){
        return topics[0];
    }

    public int getNumTopics(){
        return topics.length;
    }

    public void viewTopic(int topicIndex){
        views[topicIndex] = views[topicIndex] + 1;
    }

    public void setFavoriteArticle(int favoriteIndex, String newArticle){
        favoriteArticles[favoriteIndex] = newArticle;
    }

    public static void main(String[] args){
        Newsfeed sampleFeed = new Newsfeed();

        String[] topics = sampleFeed.getTopics();
        System.out.println(Arrays.toString(topics));

        System.out.println("The top topic is: " + sampleFeed.getTopTopic());

        //views
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);

        System.out.println("The " + sampleFeed.topics[1] + "topic has been viewed " + sampleFeed.views[1] + " times!");

        //favorite articles
        sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticle(0, "Oil News");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));

        //get the length of the array
        System.out.println("The number of topics is " + sampleFeed.getNumTopics());
    }
}
