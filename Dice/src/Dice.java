import java.util.Random;

public class Dice {

    private int[] freqs = new int[6]; // 0-5

    public int[] getFreqs() {
        return freqs;
    }

    public int roll () {
        // random between 1-6
        Random r = new Random();
        int face = r.nextInt(6)+1; // 0-5
//        freqs[face-1] = freqs[face-1]+1;
        freqs[face-1] += 1;
        // Ex face = 4
        // freqs[4-1] = freqs[4-1] + 1;
        // freqs[3]   = freqs[3] + 1;

        return face;
    }

}
