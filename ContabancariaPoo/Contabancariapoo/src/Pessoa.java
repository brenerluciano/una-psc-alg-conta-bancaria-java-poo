import java.util.Scanner;

public class Pessoa {
    private double tamanho;
    private double peso;

    public Pessoa(double tamanho, double peso) {
        this.tamanho = tamanho;
        this.peso = peso;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    Scanner scanner = new Scanner(System.in);
    public  void contaPessoa(){
        System.out.println("Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.println("Saldo inicial: ");
        double saldoConta = scanner.nextDouble();
        System.out.println("Escolha uma opção.");
        System.out.println("1° Depositar valor. \n2° Sacar valor. \n3° Obter o saldo disponível. ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("\nQual o valor a ser depositado?");
                double deposito = scanner.nextDouble();
                System.out.println("\n"+nome);
                System.out.println("Conta: "+ numeroConta);
                System.out.println("Deposito de R$: "+deposito+" realizado com sucesso.");
                double saltoatual = saldoConta + deposito;
                System.out.println("Saldo atual: " + saltoatual);
                break;
                case 2:
                System.out.println("\nQuanto deseja sacar? ");
                double sacar = scanner.nextDouble();
                if(sacar > saldoConta ){
                    System.out.println("\nSaldo insuficiente para realizar a operação.");
                }else if(sacar >= 5001){
                    System.out.println("\nValor de saque acima do permitido.");
                }else{
                    System.out.println("\nSaque de R$: "+sacar+" realizado com sucesso.");
                }
                break;
                case 3:
                System.out.println("\nSaldo da conta:");
                System.out.println(saldoConta);
                break;
        
            default:
            System.out.println("\nOpção solicitada é inexistente.");
                break;
        }
        scanner.close();
    }
     
}
