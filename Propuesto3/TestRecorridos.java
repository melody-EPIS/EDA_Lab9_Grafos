import java.util.*;
public class TestRecorridos {
	public static void main(String[] args) {
		Recorridos re = new Recorridos(8);
		re.addNodo(0,1);
       		 re.addNodo(0,2);
       		 re.addNodo(2,5);   
      		 re.addNodo(1,3); 
        	 re.addNodo(6,7);
     		 re.addNodo(0,3);
        	 re.addNodo(3,7);
        	 re.addNodo(0,4);
        	 re.addNodo(4,6);
		// Mostrar recorrido BFS	
        	System.out.println("Recorrido BFS:");
		re.bFS(0);
		System.out.println();	//Mostrar recorrido DFS
		System.out.println("Recorrido DFS");
		re.dFS(0);
		

		Recorridos re1 = new Recorridos(8);
		re1.addNodo(0,2);
        	 re1.addNodo(0,3);
        	 re1.addNodo(0,4);
        	 re1.addNodo(1,3);
       		 re1.addNodo(1,5);
        	 re1.addNodo(1,6);
        	 re1.addNodo(2,5);
        	 re1.addNodo(3,5);
        	 re1.addNodo(5,6);
        	 re1.addNodo(6,7);
		System.out.println();
     		// Mostrar recorrido BFS	
        	System.out.println("Recorrido BFS:");
		re1.bFS(0);
		System.out.println();	//Mostrar recorrido DFS
		System.out.println("Recorrido DFS");
		re1.dFS(0);
	}
}