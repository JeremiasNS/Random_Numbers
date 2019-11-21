
import java.util.Arrays;
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;

import java.util.Random;

/**
 * @author Manoel Campos da Silva Filho
 */
public class Principal {

    public static void main(String[] args) {
        /*Seed (semente) é o valor inicial a ser utilizado pelos geradores de números aleatórios.
        * Se for utilizada uma mesma seed ao executar a aplicação várias vezes, os
        * mesmos exatos valores serão gerados. Alterando a seed, a sequência de valores muda.
         */
        final long seed = 123;
        NumerosAleatorios randomNumber = new RamdomAdapter();;
        NumerosAleatorios apacheNumber = new ApacheCommonsMathAdapter();
        
        //Total de números a serem gerados em cada gerador
        final int TOTAL_NUMEROS = 4;
        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            final double[] numerosListRandom = randomNumber.buscarListaNumerosAleatorioSeed(seed, 2);
            final double[] numerosListApache = apacheNumber.buscarListaNumerosAleatorioSeed(seed, 2);
            System.out.println(Arrays.toString(numerosListRandom));
            System.out.println(randomNumber.buscarNumeroAleatorioSeed(seed));
            System.out.println(apacheNumber.buscarNumeroAleatorioSeed(seed));
            System.out.println(Arrays.toString(numerosListApache));
            System.out.println();
        }
    }


}
