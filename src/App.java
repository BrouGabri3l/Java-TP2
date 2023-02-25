import java.util.Scanner;

import Veiculo.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Civic", "Preto");
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        int soma = 0;
        boolean isEven;
        while(valor <=0){
            System.out.print("Digite um valor positivo inteiro: ");
            valor = scanner.nextInt();
            if(valor<0){
                System.out.println("Valor negativo é inválido, tente novamente");
            }
        }

        scanner.close();

        for(int i = 0; i<=valor; i++){
            System.out.println(i);
            soma+=i;
        }

        isEven = soma%2==0;

        System.out.println("A soma é igual a: " + soma);
        
        System.out.println(isEven ? "O valor da soma é par" : "O valor da soma é impar");
        
        carro.ligar();
        /*
         * Crie um programa que receba um valor inteiro positivo e:
         * a. mostre todos os valores entre 0 até valor informado
         * b. mostre a soma desses valores
         * c. indique se o número é par ou ímpar
         */
    }
}
