/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafo;

/**
 *
 * @author usuario
 */
public class Prim {
      private int anterior[];
      private double p[];
      private Grafo g;

      public Prim( Grafo g ){
          this.g=g;
      }

      public void MSTprim( int raiz )throws Exception{
          int n=this.g.getNvertices();
          this.p=new double[n];
          int[] vs=new int[n+1];
          boolean itensHeap[]=new boolean[n];
          this.anterior=new int[n];
          for(int u=0; u<n; u++){
              this.anterior[u]=-1;
              p[u]=Double.MAX_VALUE;
              vs[u+1]=u;
              itensHeap[u]=true;
          }
          p[raiz]=0;
          Heap heap=new Heap(p,vs);
          heap.Constroi();
          while(!heap.Vazio()){
              int u=heap.RemoveMin();
              System.out.println(u);
              itensHeap[u]=false;
              if(!this.g.ListaAdjVazia(u)){
                  Aresta adj=g.PrimeiroLista(u);
                  System.out.println(adj.getV1()+""+adj.getV2());
                  while(adj!=null){
                      int v=adj.getV2();

                   if(itensHeap[v]&&(adj.getPeso()<this.peso(v))){
                          
                          //p[v]=adj.getPeso();
                          anterior[v]=u;
                          heap.DiminuiChave(v, adj.getPeso());
                      }
                      
                      adj=g.ProxAdj(u);
                  }
              }
          }
      }

      public int anterior(int u){
          return this.anterior[u];
      }

      public double peso( int u ){
          return this.p[u];
      }


      public void imprime(){
          
          for( int u=0; u<this.p.length; u++){
              if(this.anterior[u]!=-1){
                  System.out.println("("+anterior[u]+","+u+")--p:"+peso(u));
              }
          }
      }
}
