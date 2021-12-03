import java.util.Scanner;
public class Media_idades {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        // Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a mensagem "IMPOSSIVEL CALCULAR".//
        int X = 0; //variavel que recebe o valor digitado//
        double Soma = 0; //variavel que soma o valor digitado antes mais o valor digitado essa variavel ficou do tipo double para conseguir mostrar as casas decimais//
        int cont = 0; //contador que intera mais 1 sempre que entra no loop//
        double Media = 0;
        System.out.println("Digite os valores das idades: ");
        X = entrada.nextInt();
        
            //enquanto X não for negativo faça//
            while(X >= 0){
            Soma = X + Soma;
            cont ++;
            X = entrada.nextInt();
            }
            if(cont==0){
                System.out.println("Impossivel calcular!");
            }else{
                Media = Soma / cont;
                System.out.println("Media = " + Media);
            }

        
        
      
      
      
      
      
      
      
      
        entrada.close();
    }
}