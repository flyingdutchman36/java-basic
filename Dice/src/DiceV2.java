import java.util.Random;

/**
 * Created by "SumarK" Copy&Paste Engineering.
 * Created On: 2/6/2565 | 15:12
 * Good luck have fun.
 */
public class DiceV2 {
    private int[] freqs = new int[6]; // 0-5

    public int[] getFreqs() {
        return freqs;
    }

    private static Random R = new Random();

    private char diceFace;

    public static char numberToFace(int face){
        return (char)(face-1 + '\u2680');
    }

    public char getDiceFace() {
        return diceFace;
    }

    private float counts = 0;
    public int roll () {
        counts++;
        int face = R.nextInt(6)+1; // 0-5
        freqs[face-1] += 1;
        diceFace = (char)(face-1 + '\u2680');
        return face;
    }

    public void showFreqs(){
        for (int i = 0; i < freqs.length; i++) {
            System.out.printf("face %d occurs %d times (%.2f%%)\n",
                    i+1,
                    freqs[i],
                    freqs[i]/counts *100 );
        }
    }

}
