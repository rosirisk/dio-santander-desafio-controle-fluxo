import java.util.Scanner;

public class Contador {

    public void contar(int parametroUm, int parametroDois) {
        for (int i = 0; i < parametroDois - parametroUm; i++) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {

        Contador contador = new Contador();

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();


        try {
            if (parametroDois < parametroUm) {
                throw new ParametrosInvalidosException("O Segundo Parametro deve ser maior que o Primeiro");
            }
            if (parametroUm == parametroDois) {
                System.out.println("Parametros são iguais!");
            } else {
                contador.contar(parametroUm, parametroDois);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());

        }

    }

}