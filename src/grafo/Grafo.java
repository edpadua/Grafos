/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafo;

/**
 *
 * @author usuario
 */
public class Grafo {
    private int Nvertices;
    private int Mat[][];
    private int pos[];


    public Grafo( int NumVertices )
    {
       
        this.Mat=new int[NumVertices][NumVertices];
        this.pos=new int[NumVertices];
        this.Nvertices=NumVertices;

        for( int i=0; i<this.Nvertices; i++ ){
            for(int j=0; j<this.Nvertices; j++){
                this.Mat[i][j]=0;

            }
            pos[i]=-1;
        }
    }


    public void InsereAresta( int V1, int V2, int Peso ){
        this.Mat[V1][V2]=Peso;
    }


    public boolean existeAresta( int V1, int V2 ){
        return(this.Mat[V1][V2]>0);
    }

    public boolean ListaAdjVazia(int V){
        int i;
        for( i=0; i<this.Nvertices; i++){
           if(this.Mat[V][i]>0){
               return false;
           }
         }
         return true;

      }

     public Aresta PrimeiroLista( int V ){
        this.pos[V]=-1;
        return this.ProxAdj(V);
   }

    public Aresta ProxAdj( int V )
    {
         this.pos[V]++;
         while((this.pos[V]<this.Nvertices)&&(this.Mat[V][this.pos[V]]==0)){
             this.pos[V]++;

         }
         if(this.pos[V]==this.Nvertices){
            return null;
         }
         else{
             return new Aresta(V,this.pos[V], this.Mat[V][this.pos[V]]);
         }

    }



   public Aresta RemoveAresta( int V1, int V2){
       if( this.Mat[V1][V2]!=0){
           Aresta a=new Aresta(V1,V2, this.Mat[V1][V2]);
           this.Mat[V1][V2]=0;
           return a;
       }
       else{
           return null;
       }
   }

   public void ImprimeGrafo(){
       int i,j;
       System.out.print(" ");
       for(i=0; i<=this.Nvertices-1; i++ ){
           System.out.print(i+" ");
           System.out.println();
       }
       for(i=0; i<=this.Nvertices-1; i++ ){
           System.out.print(i+" ");
           for(j=0; j<=this.Nvertices-1; j++){
                System.out.print(this.Mat[i][j]+" ");
           }
           System.out.println();
       }
   }

   public int getNvertices(){
       return this.Nvertices;
   }

}
