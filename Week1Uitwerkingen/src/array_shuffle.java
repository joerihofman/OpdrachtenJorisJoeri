import java.util.ArrayList;

public class array_shuffle {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        shuffle(list);
        System.out.println(list);

    }

    public static <E> void shuffle(ArrayList<E> list) {

        for (int i = 0; i < list.size(); i++) {
            int random = (int) (Math.random() * list.size()); //random geeft double tussen 0 en 1. Uiteindelijk dus een index.
            E tmp = list.get(random);       //de variable tmp is de waarde van de random index.
            list.set(random, list.get(i));  //De waarden van index random en index i worden op deze twee regels verwisseld.
            list.set(i, tmp);
        }
    }
}