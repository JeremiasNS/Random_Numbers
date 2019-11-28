
import java.util.Arrays;
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;


/**
 * @author Manoel Campos da Silva Filho
 */
public class Principal {

    public static void main(String[] args) {
        /*Seed (semente) é o valor inicial a ser utilizado pelos geradores de números aleatórios.
        * Se for utilizada uma mesma seed ao executar a aplicação várias vezes, os
        * mesmos exatos valores serão gerados. Alterando a seed, a sequência de valores muda.
         */
        final int seed = 123;
        RandomNumber randomNumber = new RamdomAdapter();
        RandomNumber apacheNumber = new ApacheCommonsMathAdapter(new NormalDistribution(),seed);
        RandomNumber apacheNumberList = new ApacheCommonsMathAdapter(new LogNormalDistribution());
        
            System.out.println(randomNumber.getNumber());
            System.out.println(Arrays.toString(randomNumber.getNumber(2)));
            
            System.out.println(apacheNumber.getNumber());
            System.out.println();
        
    }


}
