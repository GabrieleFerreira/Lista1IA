package exercicio5;

import java.util.LinkedList;
import java.util.Queue;



  
   import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList();
        
        Scanner entrada = new Scanner(System.in);
       
      System.out.println("Digite quantos números quer inserir na fila: ");
      int tamanho=entrada.nextInt();
      
      for(int i=0; i<tamanho; i++){
          System.out.println("Digite o numero na fila: ");
          fila.add(entrada.nextInt());
      }
      
      for(int i=0; i<tamanho; i++){
          System.out.print(fila.poll()+ " "); //retira o primeiro da fila e retorna o valor 
      }
        System.out.println("Fila esta vazia? " + fila.isEmpty());
    }
}