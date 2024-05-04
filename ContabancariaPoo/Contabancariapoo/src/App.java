import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa(1.75, 0);
    Scanner scanner = new Scanner(System.in);

    pessoa.contaPessoa();
    scanner.close();
    }
}
