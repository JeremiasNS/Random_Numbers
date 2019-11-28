
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;

/**
 *
 * @author aluno
 */
public class ApacheCommonsMathAdapter implements NumerosAleatorios{

    RealDistribution normalRandom;
    
    @Override
    public Double buscarNumeroAleatorioSeed(long seed) {
        normalRandom = new NormalDistribution();
        normalRandom.reseedRandomGenerator(seed);
        System.out.println("Número aleatório seguindo distribuição Normal usando biblioteca Apache Commons Math: ");
        return normalRandom.sample();
    }

    @Override
    public double[] buscarListaNumerosAleatorioSeed(long seed, int quantidade) {
        normalRandom = new LogNormalDistribution();
        normalRandom.reseedRandomGenerator(seed);
        System.out.println("Lista de Números aleatórios usando biblioteca Apache Commons Math: ");
        return normalRandom.sample(quantidade);
    }


    

}
