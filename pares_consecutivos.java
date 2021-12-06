import java.util.Scanner;
public class pares_consecutivos {
    public static void main(String[]agrs){
        //O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.// 
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        System.out.println("Digite um numero inteiro: ");
        int X = entrada.nextInt();
        int soma = 0;

        
        if( X % 2 == 0){
            while(cont < 5){
                soma = X + soma;
                X += 2;
                cont++;
            }

        }else {
            X++;
            while(cont < 5){
                soma = X + soma;
                X += 2;
                cont++;
            }
        }
        System.out.println("SOMA = " + soma);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        entrada.close();

    }
}
