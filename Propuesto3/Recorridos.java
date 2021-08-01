
import java.util.*;
public class Recorridos{
	
	public static int nodo;
	public static LinkedList<Integer>listaNodo[];
	public static Queue<Integer> queue=new LinkedList();
	public Recorridos(int nodo){
		this.nodo=nodo;
		listaNodo=new LinkedList[nodo];
		for (int i = 0; i <nodo ; i++) {
            listaNodo[i] = new LinkedList<>();
        }
	}
	public void addNodo(int u,int v){
		listaNodo[u].add(v);
	}
	public static void VisitBFS(int v,boolean[] visitado) {
		queue.add(v);
		visitado[v]=true;
		int a;
		while(!queue.isEmpty()) {
			a=queue.remove();
			System.out.print(a+" ");
			Iterator<Integer> miIter=listaNodo[a].listIterator();
			int b;
			while(miIter.hasNext()) {
				b=miIter.next();
				if(visitado[b]!=true) {
					queue.add(b);
					visitado[b]=true;
				}
			}
		}
	}
	public static void bFS(int v) {
		boolean visitado[]= new boolean[nodo];
		VisitBFS(v,visitado);
		for(int i=0;i<nodo;i++) {
			if(visitado[i]!=true)
				VisitBFS(i,visitado);
		}
		
	}
	public static void VisitDFS(int v,int[] visitado) {
		//me falta
	}
	
	public static void dFS(int v) {
		//me falta
		
	}
}
