package exercicio5;

import java.util.Scanner;

/**
 *
 * @author Giovanna de Oliveira Justino
 */

public class Ex5 {
    
    public static void main(String[] args) {
        
        String frase;
        
        //obter string do usuário
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a palvra/frase: ");
        frase = teclado.nextLine();
        
        //declaração e atribuição de variáveis
        char[] caracter = frase.toCharArray();
        int inicio = 0;
        int fim = caracter.length - 1;
        char temp;
        
        //inversão da string
        while(fim > inicio){
            temp = caracter[inicio];
            caracter[inicio] = caracter[fim];
            caracter[fim] = temp;
            fim--;
            inicio++;
        }
        
        frase = new String(caracter);
        
        //impressão da string invertida
        System.out.println(frase);
        
    }
}
