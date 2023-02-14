/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafo;

/**
 *
 * @author usuario
 */
public class Heap {
    private double p[];
    private int n, pos[], fp[];
   
    public Heap( double P[], int V[] ){
        this.p=P; this.fp=V; this.n=this.fp.length-1;
        this.pos=new int[this.n];
        for(int i=0; i<this.n; i++)this.pos[i]=i+1;
   
    }

    public void Reconstroi ( int Esq, int Dir ){
        int j=Esq*2;
        int x=this.fp[Esq];
        while(j<=Dir){
            if((j<Dir)&&(this.p[fp[j]]>this.p[fp[j+1]]))
                j++;
       
            if(this.p[x]<=this.p[fp[j]])
                break;
            
            this.fp[Esq]=this.fp[j];
            this.pos[fp[j]]=Esq;
            Esq=j;
            j=Esq*2;

        }
        this.fp[Esq]=x;
        this.pos[x]=Esq;
    }

    public void Constroi(){
        int Esq=n/2+1;
        while(Esq>1){
            Esq--;
            this.Reconstroi(Esq, this.n);
        }

    }

    public int RemoveMin() throws Exception{
        int min;
        if(this.n<1){
            throw new Exception("Erro");
        }
        else{
            min=this.fp[1];
            this.fp[1]=this.fp[this.n];
            this.pos[fp[this.n--]]=1;
            this.Reconstroi(1,this.n);
        }
        return min;
    }

    public void DiminuiChave( int i, double chaveNova )throws Exception{
        i=this.pos[i];
        int x=fp[i];
        if(chaveNova<0){
            throw new Exception("Erro");
        }
        this.p[x]=chaveNova;
        while((i>1)&&(this.p[x]<=this.p[fp[i/2]])){
            this.fp[i]=this.fp[i/2];
            this.pos[fp[i/2]]=i;
            i/=2;
        }
        this.fp[i]=x;
        this.pos[x]=i;
    }

    boolean Vazio(){
        return this.n==0;
    }

}
