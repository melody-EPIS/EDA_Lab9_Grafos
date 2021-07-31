
import java.util.*;
public class ListaAdyacencia{
	public class Nodo{	
		int nodo,w;
		public Nodo(int nodo,int w) {
			this.nodo=nodo;
			this.w=w;
		}
		@Override
		public String toString(){
			return "("+nodo+","+w+")";
		}  
	}
	LinkedList<Nodo>listaNodo[];
	public ListaAdyacencia(int n){
		listaNodo=new LinkedList[n];
		for(int i=0;i<listaNodo.length;i++)
			listaNodo[i]=new LinkedList<Nodo>();
	}
	public void addNodo(int u,int v,int w){
		listaNodo[u].add(0,new Nodo(v,w));
	}
	@Override
	public String toString(){
		String result="";
		for(int i=0;i<listaNodo.length;i++)
			result+=i+"=>"+listaNodo[i]+"\n";
		return result;
	}
	
}
