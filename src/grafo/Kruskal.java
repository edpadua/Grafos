/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafo;

/**
 *
 * @author usuario
 */
public class Kruskal {
      private int[] anterior;
      private double[] p;
      private Grafo g;

      public Kruskal( Grafo g ){
          this.g=g;

      }



      No find( No no ){

          if( no.pai==null){
              return no;
          }
          else{
              return find(no.pai);
          }

      }

      void uniao( No a, No b ){
          No pa=find(a);
          No pb=find(b);
          if(pa.size>pb.size){
              pb.pai=pa;
              pa.size+=pb.size;
          }
          else{
              pa.pai=pb;
              pb.size+=pa.size;
          }
      }
}
