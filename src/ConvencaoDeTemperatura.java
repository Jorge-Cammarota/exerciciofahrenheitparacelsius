import java.text.DecimalFormat;
import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.C;

public class ConvencaoDeTemperatura {
    public static void main(String[] args) {
        // variáveis
        double c, f;
        // objetos
      Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0");
        // entrada de dados
        System.out.println("Conversão de temperatura");
        System.out.println("Digite a temperatura em fahrenheit: ");
        f = teclado.nextDouble();
        //processamento
        c = (5 * (f - 32)) / 9;
        // saida
        System.out.println("Temperatura em Celsius: " + formatador.format(c) + "°c");
        teclado.close();
    }

}
