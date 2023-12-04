import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado do local: ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Total de área = %.2f" + " metros quadrados\n", area);
        System.out.printf("Valor do terreno = R$%.2f" + " mil reais\n", preco);

        sc.close();


        }
    }
