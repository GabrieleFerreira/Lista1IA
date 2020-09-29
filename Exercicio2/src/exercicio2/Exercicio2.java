package exercicio2;
import java.util.Scanner;

//Faça um programa que leia 10 números e os armazene em um vetor. Imprima o vetor

public class Exercicio2 {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int [] num = new int[10];
       
        for(int i=0; i<10;i++){
              System.out.println("Digite um número inteiro: ");
        num[i]=scan.nextInt();}
        
        for(int j=0;j<10; j++){
        System.out.println(num[j]);
    } 
        System.out.println();
        
    }
    
}
