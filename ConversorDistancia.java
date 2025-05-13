import java.util.Scanner;
//classe Scanner que lê o que a pessoa digita
//java.util é um pacote que vem com o Java

public class ConversorDistancia  {

    public static void main(String[] args) {

    Scanner medida = new Scanner(System.in);

    System.out.print("Digite um valor em metros: ");
    int metros = medida.nextInt();

    // Converter metros para outras unidades
    int decimetros = metros * 10;
    int centimetros = metros * 100;
    int milimetros = metros * 1000;

    // Imprimir os resultados com o formato %d
    System.out.printf("%d metros é equivalente a:\n", metros);
    System.out.printf("%d decimetros\n", decimetros);
    System.out.printf("%d centimetros\n", centimetros);
    System.out.printf("%d milimetros\n", milimetros);
    }
}
