import java.util.Scanner;
public class combustivel {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);

        //Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem como as quantidades de cada combustível.//

        int alcool = 0, gasolina = 0, diesel = 0;
        int produto;
        System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        produto = entrada.nextInt();
        while(produto < 4 || produto > 4){
            if(produto == 1){
                System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                produto = entrada.nextInt();
                alcool++;
            }else if(produto == 2){
                System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                produto = entrada.nextInt();
                gasolina ++;
            }else if(produto == 3){
                System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                produto = entrada.nextInt();
                diesel ++;
            }else{
                System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                produto = entrada.nextInt();
            }
        }
        System.out.println("Muito obrigado");
        System.out.println("Alcool:" + alcool);
        System.out.println("Gasolina:" + gasolina);
        System.out.println("Diesel:" + diesel);


        




        
        
        
        
        
        
        
        
        
        
        
        
        entrada.close();
    }
}
