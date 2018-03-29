/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubmaarcosgf;

/**
 *
 * @author IFSC
 */
public class Vetor {
int vet[];
            /* Construtor */
            public Vetor(int size){
                vet = new int[size];
            }
            
            public void randomFill(){
                Random r = new Random();
                   for(int i=0; i<vet.lenght;i++){
                       vet[i] = r.nextInt(1000);
                   }
            }
            
            public void bubbleSort(){}
           
            public String toString(){
                return null;   
            }

            public boolean equals(int[] v){
                return false;
            }
      
            public void setAt(int pos, int value){}
         
            public int valueAt(int pos){
                return 0;
            }
          
            public int length(){
                return 0;
            }
            
            public Vetor Concat(Vetor v){
                return null; 
            }
    
}
