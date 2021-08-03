import java.util.*;
public class TestDijkstra{
	public static void main(String[] args) {
		
		
	int num = 7; 
        int b = 0; 
        List<List<Nodo> > miLista = new ArrayList<List<Nodo> >(); 
        
        for (int i = 0; i < num; i++) { 
            List<Nodo> item = new ArrayList<Nodo>(); 
            miLista.add(item); 
        } 
        miLista.get(0).add(new Nodo(1, 2)); 
        miLista.get(0).add(new Nodo(2, 6)); 
        miLista.get(1).add(new Nodo(3, 5)); 
        miLista.get(2).add(new Nodo(3, 8));
        miLista.get(3).add(new Nodo(5, 15));
        miLista.get(3).add(new Nodo(4, 10)); 
        miLista.get(4).add(new Nodo(6, 2)); 
        miLista.get(4).add(new Nodo(5, 6));  
        miLista.get(5).add(new Nodo(6, 6)); 
        Dijkstra a = new Dijkstra(num); 
        a.DijkstraA( miLista,b); 
   
        System.out.println("Algoritmo de Dijkstra:"); 
        System.out.println("Inicio\t" + "Nodo\t" + "Distancia");
        for (int i = 0; i < a.dist.length; i++) 
            System.out.println(b+"\t "+ i + " \t "+ a.dist[i]);*/
		
		
	}
}