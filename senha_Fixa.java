import java.util.Scanner;
public class senha_Fixa {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.//
        System.out.println("Digite a senha: ");
        int senha = entrada.nextInt();
        while(senha!=2002){
            System.out.println("Senha Invalida! Tente novamente:  ");
            senha = entrada.nextInt();
        
        }
        if(senha == 2002){
            System.out.println("Acesso permitido!");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        entrada.close();
    }
}
