import java.util.*;

public class ChatBot {
    String name;

    Map<String, String> questions;
    public ChatBot(String name){
        this.name= name;
        this.questions = new HashMap<String,String>();

    }

    public void addQuestion(String erotisi, String apantisi){
        questions.put(erotisi, apantisi); // εδω αντισοιχουμε την ερωτηση με την απαντηση

    }
}