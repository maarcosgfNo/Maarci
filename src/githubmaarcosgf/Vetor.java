/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubmaarcosgf;

import java.util.Random;

/**
 *
 * @author IFSC
 */
public class Vetor {
private int vet[];
    private int contatenarVetor[];
    private int size;
    private int contador=0;
    private boolean igualdade = false;
    private int i=0;
    private int tamanhoVetor;
    /* Construtor */
            public Vetor(int tamanho){
               vet = new int[tamanho];
               size = tamanho;
            }
            
            public void randomFill(){
                Random rand = new Random();
                for(contador =0 ; contador < size ; contador ++){
                     vet[contador] = 2 + rand.nextInt();
        }
            }
            
            public void bubbleSort(){
                 int muda;
                 int auxiliar;
                 muda = 1;
                    while (muda == 1){
                           muda = 0;        
                    for (int i = 0; i <= 3; i++){
                        if (vet[i] > vet[i + 1]){
                            muda = 1;
                            auxiliar = vet[i];
                            vet[i] = vet[i + 1];
                            vet[i + 1] = auxiliar;
               }
           }
        }
      }
           
            public String toString(){
                String vetores[] = new String[size];
                for(contador=0; contador<size;contador++){
                    vetores[contador] = Integer.toString(vet[contador]) ;
        }
                    return vetores[size];  
            }

            public boolean equals(int[] v){
                 for(contador=0; contador<size;contador++){
                    if(vet[contador] == v[contador]){
                        i++;
                }
            }
                    if(i == size){
                     igualdade = true;
        }
                return igualdade;
            }
      
            public void setAt(int posi, int value){
              vet[posi] = value;
            }
         
            public int valueAt(int posi){
                return vet[posi];
            }
          
            public int length(){
                tamanhoVetor = vet.length;
                return tamanhoVetor;
    
            }
            
            public Vetor Concat(Vetor v){
                for(contador=0;contador<(size + v.length()); contador ++){
                      if(contador<size){
                      contatenarVetor[contador] = vet[contador];
                }else{
                      contatenarVetor[contador] = vet[contador];
                     }
                }
                return null;
                 
                }     
            }
    

