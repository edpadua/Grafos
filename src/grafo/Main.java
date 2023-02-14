/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafo;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        Grafo g=new Grafo(6);
        Prim p;

        g.InsereAresta(0,1,6);
        g.InsereAresta(1,0,6);
        g.InsereAresta(0,2,1);
        g.InsereAresta(2,0,1);
        g.InsereAresta(0,3,5);
        g.InsereAresta(3,0,5);
        g.InsereAresta(1,2,2);
        g.InsereAresta(2,1,2);
        g.InsereAresta(1,4,5);
        g.InsereAresta(4,1,5);
        g.InsereAresta(2,3,2);
        g.InsereAresta(3,2,2);
        g.InsereAresta(4,2,6);
        g.InsereAresta(2,4,6);
      
        g.InsereAresta(2,5,7);
        g.InsereAresta(5,2,7);
        g.InsereAresta(4,5,3);
        g.InsereAresta(5,4,3);
        g.InsereAresta(3,5,4);
        g.InsereAresta(5,3,4);
       // System.out.println(g.getNvertices());
        //g.ImprimeGrafo();
        p=new Prim(g);
        p.MSTprim(0);
        p.imprime();

    }

}
