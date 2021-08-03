
import java.util.*; 
public class Dijkstra{
	int dist[]; 
    ArrayList<Integer> visitado; 
    PriorityQueue<Nodo> pq; 
    int num;//numero de vertices
    List<List<Nodo> > nodoLista; 
    
    public Dijkstra(int num) { 
        this.num = num; 
        dist = new int[num]; 
        visitado = new ArrayList<Integer>(); 
        pq = new PriorityQueue<Nodo>(num, new Nodo()); 
    } 
    public void DijkstraA(List<List<Nodo> >nodoLista, int a){ 
        this.nodoLista = nodoLista; 
        for (int i = 0; i < num; i++) 
            dist[i] = Integer.MAX_VALUE; 
        pq.add(new Nodo(a, 0)); 
        dist[a] = 0; 
        while(visitado.size()!= num){ 
            int u = pq.remove().nodo;
            visitado.add(u); 
            add(u); 
        } 
    } 
    private void add(int u)   { 
        int distA = -1; 
        int distN = -1; 
        for (int i = 0; i <nodoLista.get(u).size(); i++){ 
            Nodo v = nodoLista.get(u).get(i); 
            if (!visitado.contains(v.nodo)) { 
                distA = v.costo; 
                distN = dist[u] + distA;
                if (distN < dist[v.nodo]) 
                    dist[v.nodo] = distN;
                pq.add(new Nodo(v.nodo, dist[v.nodo])); 
            } 
        } 
    }
}

