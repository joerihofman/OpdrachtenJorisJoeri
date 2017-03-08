import java.util.LinkedList;

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

        String test = linked.toString();
        return test;
    }

    public static String shuffle(LinkedList<Integer> linked){
        for (int i = 0; i < linked.size(); i++) {
            int random = (int) (Math.random() * linked.size()); //random geeft double tussen 0 en 1. Uiteindelijk dus een index.
            Integer temporary = linked.get(random);       //de variable tmp is de waarde van de random index.
            linked.set(random, linked.get(i));  //De waarden van index random en index i worden op deze twee regels verwisseld.
            linked.set(i, temporary);
        }

        String test = linked.toString();
        return test;
    }

    public static String reverse(LinkedList<Integer> linked) {
        String test = linked.toString();
        return test;
    }

    public static String listToString(LinkedList<Integer> linkedList){
        String delijst=null;
        return delijst;
    }
}
