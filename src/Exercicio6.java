//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner; //Pacote importa (Habilita) o teclado
public class Exercicio6 { 

    public static void main (String args[]) {
        Scanner enterScanner = new Scanner(System.in); //Atribui o nome "enterScanner" à entrada do teclado
        
        System.out.println("Digite o raio: "); //Imprime na tela a mensagem
        double raio = enterScanner.nextInt(); //Aloca a variável raio e grava o valor digitado
        
        double area = Math.PI * ( raio * raio ); //Aloca a variável area e realiza o cálculo da área

        System.out.println("A área do circulo é de: " + area + " m2 ou cm2"); //Imprime na tela a mensagem + a área
        enterScanner.close(); //Encerra as entradas do teclado
    }
}