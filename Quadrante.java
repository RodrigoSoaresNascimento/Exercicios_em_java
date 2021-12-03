import java.util.Scanner;
public class Quadrante {
    public static void main(String[]agrs){
        //Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2, Q3 ou Q4). O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).//
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os valores das idades: ");
        double X = entrada.nextInt();
        System.out.println("Digite os valores das idades: ");
        double Y = entrada.nextInt();
        //enquanto x ou y não forem 0 faça//
        while(X != 0 || Y != 0){
            if(X > 0 && Y > 0){
                System.out.println("Quadrante Q1: ");
                System.out.println("Digite os valor da coordenanda X ");
                X = entrada.nextInt();
                System.out.println("Digite os valor da coordenada Y: ");
                Y = entrada.nextInt();
            }else if (X > 0 && Y < 0){
                System.out.println("Quadrante Q4: ");
                System.out.println("Digite os valor da coordenanda X ");
                X = entrada.nextInt();
                System.out.println("Digite os valor da coordenada Y: ");
                Y = entrada.nextInt();

            }else if(X < 0 && Y > 0){
                System.out.println("Quadrante Q2: ");
                System.out.println("Digite os valor da coordenanda X ");
                X = entrada.nextInt();
                System.out.println("Digite os valor da coordenada Y: ");
                Y = entrada.nextInt();
            }else if(X < 0 && Y < 0){
                System.out.println("Quadrante Q3: ");
                System.out.println("Digite os valor da coordenanda X ");
                X = entrada.nextInt();
                System.out.println("Digite os valor da coordenada Y: ");
                Y = entrada.nextInt();
            }
        }
        entrada.close();
    }
}
