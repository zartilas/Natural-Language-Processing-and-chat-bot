import java.util.Set;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String args[]) {
        ChatBot mybot = new ChatBot("MariaBot");

        System.out.println("Welcome. I am " + mybot.name);
        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Hello " + username + "." + " " + "Ask me a question please!");


        //ακολουθει μια μικρή βάση γνώσης για το bot μας
        mybot.addQuestion("old you", "Never ask a lady for her age!!");
        mybot.addQuestion("capital Cyprus", "Nicosia!!");
        mybot.addQuestion("hello", "Hello to you!!");
        mybot.addQuestion("capital Greece", "Athens!!");
        mybot.addQuestion("weather today", "Sunny...I suppose ");
        mybot.addQuestion("how are you", "I feel very well");
        mybot.addQuestion("bye", "See you soon");

        Set<String> availableQuestions = mybot.questions.keySet(); //τοποθετουμε στο set την βαση γνώσης
        while (true) {
            String input = scanner.nextLine();
            boolean found = false;
            if (input.trim().equals("") ){
                break;
            }
            else {
                String [] in = input.split(" ");    // {what,is,the,capital,of,cyprus} //σπάζουμε την πρόταση
                int c = 0;
                int size = in.length; //τοποθετουμε το μεγεθος της εισοδου του χρηση στην μεταβλητη size
                for (int i = 0; i < size; i++){
                    for( String k : availableQuestions){ // capital  Cyprus // ελεγχος πειθανων ερωτήσων (αν υπαρχει η αντιστοιχει απαντηση στην βαση γνωσης)
                        String [] keys = k.split(" ");     // keys[0] = "capital"; keys [1]="Cyprus" δλδ
                        for (int j = 0;j<keys.length; j++) {    //για καθε προταση που δινει ο χρηστης τις σπαζει σε λεξεις κλειδια
                            if (input.contains(keys[j])) { //αν υπαρχει το κλειδι
                                c++;
                                if (c == keys.length) {
                                    System.out.println(mybot.questions.get(k)); //απαντα στην ερωτηση του χρηστη
                                    if(keys[j].equals("bye")){
                                        exit(-1);
                                    }
                                    found=true; //και βγαινει απο του Loop
                                    break;
                                }
                            }
                        }
                        c=0;
                        if(found) break; // αν βρεικε απαντηση αποχωρει και περιμένει την επομενη ερωτητηση
                    }
                    if(!found) { //αν δεν βρει απαντηση ενημερωνει αναλογα τον χρηστη
                        System.out.println("I can not answer that at the moment");
                    }
                    break; } } } }}