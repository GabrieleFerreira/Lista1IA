package exercicio4;

import java.util.Scanner;
import java.util.Stack;

//Faça um programa que leia 10 números, insira em uma pilha. O programa deve remover os dados da pilha e imprimi-los na tela.

public class Exercicio4 {
    public static void main(String[] args) {
       
       //leitura de dados do teclado
         Stack<Integer> pilha=new Stack();
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um numero");
    
        //leitura de dados do teclado
       
        for ( int i=0; i <=3;i++){
       
             int numero= scan.nextInt();
                         pilha.push(numero);}
             for(int j=0; j<=3;j++){
                 System.out.println( pilha.pop());
             }
         
         
                
        
                
    }
    }
    

