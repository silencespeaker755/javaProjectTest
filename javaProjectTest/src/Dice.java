import java.util.Random;

public class Dice {
    private int number;

    public int throwDice() {
        Random r1 = new Random();
        number = r1.nextInt(6)+1;
        return number;
    }
}
