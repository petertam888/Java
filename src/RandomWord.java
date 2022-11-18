import edu.princeton.cs.algs4.*;

public class RandomWorld {

    public static void main(String[] args) {
        String champion = "";

        for (int i = 1; !StdIn.isEmpty(); i++){
            String contender = StdIn.readString();
            if (StdRandom.bernoulli(1/i)){
                champion = contender;
            }
        }
        System.out.println(champion);
        }
    }






