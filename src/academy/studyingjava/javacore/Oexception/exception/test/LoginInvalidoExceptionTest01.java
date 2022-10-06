package academy.studyingjava.javacore.Oexception.exception.test;

import academy.studyingjava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);

        String usernameDB = "adiel.amaral";
        String passwordDB = "adiel123";

        System.out.println("Usuário:");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha:");
        String passwordDigitado = teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Login efetuado com sucesso!");
    }
}
