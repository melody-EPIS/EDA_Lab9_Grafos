public class TestListAdyacencia {
	public static void main(String[] args) {
		System.out.println("Lista de adyacencia");
		ListaAdyacencia nodos=new ListaAdyacencia(6);
		nodos.addNodo(0,1,5);
		nodos.addNodo(0,5,2);
		nodos.addNodo(1,2,4);
		nodos.addNodo(2,3,9);
		nodos.addNodo(3,4,7);
		nodos.addNodo(3,5,3);
		nodos.addNodo(4,0,1);
		nodos.addNodo(5,2,1);
		nodos.addNodo(5,4,8);
		System.out.println(nodos);
	}
}