import java.util.Scanner;
public class Crescente{
    public static void main(String[]agrs){
        
        Scanner entrada = new Scanner(System.in);
       
        int X, Y;
        System.out.println("Digite outro valor: ");
            X = entrada.nextInt();
            System.out.println("Digite outro valor: ");
            Y = entrada.nextInt();
        if(X<Y){
            System.out.println("Crescente ");
        }else{
            System.out.println("Decrescente ");
        }
        while(X!=Y){
            System.out.println("Digite outro valor: ");
            X = entrada.nextInt();
            System.out.println("Digite outro valor: ");
            Y = entrada.nextInt();
            if(X<Y){
                System.out.println("Crescente ");
            }else{
                System.out.println("Decrescente ");
            }   
       }
      
      
      
      
      
      
      
      
        entrada.close();
    }
}