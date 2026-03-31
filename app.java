package AtividadeEmail;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        //Vai tentar validar um email, e se for invalido, vai lançar a exceção personalizada
        try {
            validarEmail(email);
        } catch (EmailInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
        validarIdade(idade);
    } catch (IdadeInvalidaExcecao e) {
        System.out.println("Erro: " + e.getMessage());
    }
}

    public static void validarEmail(String email) throws EmailInvalidoException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailInvalidoException("Email invalido: " + email);
        }
    }

    public static void validarIdade(int idade) throws IdadeInvalidaExcecao {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaExcecao("Idade invalida: " + idade);
        }
    }
    
}
