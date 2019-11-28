
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;

/**
 *
 * @author aluno
 */
public class ApacheCommonsMathAdapter implements RandomNumber{

    private RealDistribution random;
    
    public ApacheCommonsMathAdapter(RealDistribution random){
        this.random = random;
    }

    public ApacheCommonsMathAdapter(RealDistribution random, long seed){
        this(random);
        random.reseedRandomGenerator(seed);
    }

    @Override
    public double getNumber() {
        return random.sample();
    }
    
    @Override
    public double[] getNumber(int quantidade) {
        return random.sample(quantidade);
    }

}
