import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" === Bem Vindo ao Conversor de Moeda === ");
        int opcao = 0;
        String menu = """
                1) Dólar =>> Peso Argentino
                2) Peso Argentino =>> Dólar
                3) Dólar =>> Real Brasileiro
                4) Real Brasileiro =>> Dólar
                5) Dólar =>> Peso Colombiano
                6) Peso Colombiano =>> Dólar
                7) sair
                """;

        while (opcao != 7) {
            System.out.println();
            System.out.println(menu);
            System.out.print("Digite uma opção válida: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                System.out.print("Digite o valor a ser convertido: ");
                double valor = sc.nextDouble();
                double taxa;
                double convertido;

                switch (opcao) {
                    case 1:
                        taxa = Conversor.obterTaxaDeConversao("USD", "ARS");
                        convertido = valor ;
                        System.out.println(valor + " USD = " + convertido + " ARS");
                        break;
                    case 2:
                        taxa = Conversor.obterTaxaDeConversao("ARS", "USD");
                        convertido = valor ;
                        System.out.println(valor + " ARS = " + convertido + " USD");
                        break;
                    case 3:
                        taxa = Conversor.obterTaxaDeConversao("USD", "BRL");
                        convertido = valor;
                        System.out.println(valor + " USD = " + convertido + " BRL");
                        break;
                    case 4:
                        taxa = Conversor.obterTaxaDeConversao("BRL", "USD");
                        convertido = valor;
                        System.out.println(valor + " BRL = " + convertido + " USD");
                        break;
                    case 5:
                        taxa = Conversor.obterTaxaDeConversao("USD", "COP");
                        convertido = valor;
                        System.out.println(valor + " USD = " + convertido + " COP");
                        break;
                    case 6:
                        taxa = Conversor.obterTaxaDeConversao("COP", "USD");
                        convertido = valor * taxa;
                        System.out.println(valor + " COP = " + convertido + " USD");
                        break;
                }
            } else if (opcao == 7) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
