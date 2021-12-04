import java.util.Scanner;
public class Validacao_nota{
    public static void main(String[]agrs){
    Scanner entrada = new Scanner(System.in);
    //Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.//

    System.out.println("Digite a primeira nota: ");
    double nota1 = entrada.nextDouble();
    System.out.println("Digite a segunda nota: ");
    double nota2 = entrada.nextDouble();
    
        while(nota1 < 0 || nota1 > 10){
            System.out.println("Valor invalido! primeira nota, tente novamente: ");
            nota1 = entrada.nextDouble();
        }   
        while(nota2 < 0 || nota2 > 10){
            System.out.println("Valor invalido! segunda nota, tente novamente: ");
            nota2 = entrada.nextDouble();
        }
        
    
        double Media = (nota1 + nota2)/2;
        System.out.println("Media é: " + Media);
       
    
    
    
    
    
    
    
    
       
        entrada.close();
    
    }    


}   
