/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafo;

/**
 *
 * @author usuario
 */
public class Aresta {
     private int v1,v2,peso;

     public Aresta( int v1, int v2, int peso ){
         this.v1=v1;
         this.v2=v2;
         this.peso=peso;
     }

     public int getPeso(){
         return peso;
     }

     public int getV1(){
         return v1;
     }

     public int getV2(){
         return v2;
     }

}
