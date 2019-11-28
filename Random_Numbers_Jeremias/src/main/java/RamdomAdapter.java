
import java.util.Random;

/**
 *
 * @author aluno
 */
public class RamdomAdapter implements NumerosAleatorios {

    Random random;

    @Override
    public Double buscarNumeroAleatorioSeed(long seed) {
        random = new Random(seed);
        System.out.println("Número aleatório seguindo distribuição Uniforme usando classe Random: ");
        return random.nextDouble();
    }

    @Override
    public double[] buscarListaNumerosAleatorioSeed(long seed, int quantidade) {
        random = new Random(seed);
        double[] numeros = random.doubles(quantidade).toArray();
        System.out.println("Lista de Números aleatórios usando classe Random: ");
        return numeros;
    }

}
