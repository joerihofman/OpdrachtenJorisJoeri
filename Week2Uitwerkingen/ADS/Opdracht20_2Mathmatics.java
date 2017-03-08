import java.util.LinkedList;
import java.util.ListIterator;
import java.util.RandomAccess;

import static java.util.Collections.swap;

public class Opdracht20_2Mathmatics {

    public static String sort(LinkedList<Integer> linked){
        Boolean sorted = true;
        while (sorted){
            sorted = false;
            for (int i = 0; i < linked.size() - 1; i++){
                if (linked.get(i) > linked.get(i + 1)){
                    Integer temporaryI = linked.get(i);
                    linked.set(i, linked.get(i+1));
                    linked.set(i+1, temporaryI);
                    sorted = true;
                }
            }
        }

        String resultString = listToString(linked);
        return resultString;
    }

    public static String shuffle(LinkedList<Integer> linked){
        for (int i = 0; i < linked.size(); i++) {
            int random = (int) (Math.random() * linked.size()); //random geeft double tussen 0 en 1. Uiteindelijk dus een index.
            Integer temporary = linked.get(random);       //de variable tmp is de waarde van de random index.
            linked.set(random, linked.get(i));  //De waarden van index random en index i worden op deze twee regels verwisseld.
            linked.set(i, temporary);
        }

        String resultString = listToString(linked);
        return resultString;
    }

    public static String reverse(LinkedList<Integer> linked) {
        //Inspiratie: http://www.java67.com/2015/01/how-to-reverse-arraylist-in-java-with.html

        int size = linked.size();

        ListIterator fwd = linked.listIterator();
        ListIterator rev = linked.listIterator(size);
        for (int i=0, mid=linked.size()>>1; i<mid; i++) {
            Object tmp = fwd.next();
            fwd.set(rev .previous());
            rev.set(tmp);
        }

        String test = linked.toString();
        return test;
    }

    //vrij naar http://stackoverflow.com/questions/19283083/printing-out-a-linked-list-using-tostring
    public static String listToString(LinkedList<Integer> linkedList){
        StringBuilder result = new StringBuilder();
        for(Object item:linkedList) {
            result.append(item.toString());
            result.append(" ");
        }
        return result.toString();
    }
}
