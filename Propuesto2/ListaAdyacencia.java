import java.util.*;
public class ListaAdyacencia{
	int nodo;
	LinkedList<Integer>listaNodo[];
	public ListaAdyacencia(int nodo){
		this.nodo=nodo;
		listaNodo=new LinkedList[nodo];
		for (int i = 0; i <nodo ; i++) {
            listaNodo[i] = new LinkedList<>();
        }
	}
	void addNodo(int u,int v){
		listaNodo[u].addFirst(v);
		listaNodo[v].addFirst(u);
	}
	 
	@Override
	public String toString(){
		String result="";
		for(int i=0;i<listaNodo.length;i++)
			result+=i+"=>"+listaNodo[i]+"\n";
		return result;
	}
	
}
