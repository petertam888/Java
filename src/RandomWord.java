import edu.princeton.cs.algs4.*;

public class RandomWord {
    public static void main(String[] args) {
        String word, champion = null;
        int i = 0;

        while(!StdIn.isEmpty()){
            i++;
            word = StdIn.readString();
            if (StdRandom.bernoulli(1/i){
                champion = word;
            }
        }
        StdOut.println(champion);
        }
    }






