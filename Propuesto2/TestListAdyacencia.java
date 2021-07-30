public class TestListAdyacencia {
	public static void main(String[] args) {
		System.out.println("Lista de adyacencia");
		ListaAdyacencia nodos=new ListaAdyacencia(7);
		nodos.addNodo(0, 1);
		nodos.addNodo(0, 4);
		nodos.addNodo(1, 2);
		nodos.addNodo(1, 3);
		nodos.addNodo(1, 4);
		nodos.addNodo(2, 3);
		nodos.addNodo(3, 4);
		System.out.println(nodos);
	}
}