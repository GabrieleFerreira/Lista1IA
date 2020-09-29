package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

   // Faça um programa que leia e preencha uma matriz de 10x10. No final, imprima a matriz.

    public static void main(String[] args) {
       int [][] num= new int[10][10];
       Scanner scan = new Scanner(System.in);
        
        for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
            System.out.println("Digite um numero inteiro;");
        num[i][j]= scan.nextInt();
        }
        }
        System.out.println("A matriz é:");
        for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
            System.out.print(" "+num[i][j]);
        }
            System.out.println();
        
    }
    
}}
