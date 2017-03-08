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
