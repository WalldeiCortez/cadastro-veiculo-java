import model.Veiculo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO DE VEÍCULO ===");

        System.out.println("Informe o ID do veículo: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a marca do veículo: ");
        String marca = scanner.nextLine();

        System.out.println("Informe o modelo do veículo: ");
        String modelo = scanner.nextLine();

        System.out.println("Informe o ano do veículo: ");
        String ano = scanner.nextLine();

        System.out.println("Informe o valor de venda do veículo: R$ ");
        double valorVenda = scanner.nextDouble();

        Veiculo veiculo = new Veiculo(id,marca, modelo, ano, valorVenda);

        System.out.println("== DADOS DO VEÍCULO ==");
        System.out.println(veiculo.printVeiculo());

        scanner.close();
    }
}