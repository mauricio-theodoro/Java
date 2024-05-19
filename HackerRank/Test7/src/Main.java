import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int queries = input.nextInt();

        // Cria um array bidimensional para armazenar as consultas
        int[][] Val = new int[queries][3]; // cada linha representa uma consulta, e as três colunas representam a, b e n
        // Loop para ler todas as consultas e armazená-las no array
        for (int i = 0; i < queries; i++){
            for (int j = 0; j < 3; j++){
                Val[i][j] = input.nextInt();// lê os valores de a, b e n para a consulta i e os armazena na linha i do array
            }
        }

        for (int i = 0; i < queries; i++){ // Extrai os valores de a, b e n da consulta atual

            int a = Val[i][0];
            int b = Val[i][1];
            int n = Val[i][2];
            int term = a;// inicializa o termo com o valor de a

            for(int x = 0; x < n; x++){
                term += (int)Math.pow(2, x) * b;// calcula o termo atual da série
                System.out.print(term + " ");
            }
            System.out.println();
        }
        input.close();
    }
}