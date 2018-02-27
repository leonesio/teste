/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordem;

/**
 *
 * @author cassiano
 */
public class AlgoritmosDeOrdenacao {
    //Ordena um vetor de inteiros
    public static int[] combSort (int[] vetor){
        
        float valor;
        valor = (float)1.3;
        
        int tamanho = vetor.length;
        float incremento;
        incremento = (float)tamanho/valor;
        int trocas;
        trocas = 1;
        
        while((incremento > 1)||(trocas != 0)){
            int auxincr;
            trocas = 0;
            if(incremento < 1){
                incremento = 1;
            }
            auxincr = (int)incremento;
            for(int i=0;i+auxincr < tamanho; i++){
                if(vetor[i]>vetor[i+auxincr]){
                    int aux = vetor[i];
                    vetor[i] = vetor[i+auxincr];
                    vetor[i+auxincr] = aux;
                    trocas++;
                }
            }
            incremento = incremento/valor;
            
        }
        return vetor;
    }
    
   //Classe principal para teste
    public static void main (String[] args){
        int[] vetor = {4,5,2,3,9,7,1,8,20,56,13,89,76,54,17,0};
        vetor = combSort (vetor);
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        
    }
    
}
