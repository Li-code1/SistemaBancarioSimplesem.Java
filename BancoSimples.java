import java.util.Scanner;

public class BancoSimples {
    private double saldo;
    private double totalSacado;
    private double totalDepositado;

    public BancoSimples(double saldoInicial) {
        this.saldo = saldoInicial;
        this.totalSacado = 0;
        this.totalDepositado = 0;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("❌ Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            totalSacado += valor;
            System.out.println("✅ Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("⚠️ Valor de depósito inválido.");
        } else {
            saldo += valor;
            totalDepositado += valor;
            System.out.println("✅ Depósito de R$" + valor + " realizado com sucesso.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("📊 Informações da Conta:");
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("Total sacado: R$" + totalSacado);
        System.out.println("Total depositado: R$" + totalDepositado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoSimples conta = new BancoSimples(1000.0); // saldo inicial

        while (true) {
            System.out.println("\n💰 Menu:");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Realizar saque");
            System.out.println("3 - Realizar depósito");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.exibirInformacoes();
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: R$");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    System.out.print("Digite o valor do depósito: R$");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 4:
                    System.out.println("👋 Obrigado por usar o sistema bancário!");
                    scanner.close();
                    return;
                default:
                    System.out.println("⚠️ Opção inválida. Tente novamente.");
            }
        }
    }
}
