
import java.util.Random;

/**
 *
 * @author aluno
 */
public class RamdomAdapter implements RandomNumber {

    private Random random;

    public RamdomAdapter() {
        random = new Random();
    }

    public RamdomAdapter(long seed) {
        random = new Random(seed);
    }

    @Override
    public double getNumber() {
        return random.nextDouble();
    }

    @Override
    public double[] getNumber(int quant) {
        return random.doubles(quant).toArray();
    }

}
