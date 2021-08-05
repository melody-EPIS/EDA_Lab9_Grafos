package Grafitos;
import java.util.*;
public class Adyacencia{
	public class Nodo{
        String str;
        boolean isEnd;
        boolean visit;
        HashMap<Character,Nodo> hijo;
        
        public Nodo() {
          this.isEnd = false;
          this.visit = false;
          this.str = "";
          hijo = new HashMap<Character,Nodo>();
        }
        @Override
		public String toString(){
			return "("+str+")";
		}  
    }
    public Nodo root = new Nodo();
    public int tam = Integer.MAX_VALUE;
    public int longitud(String pala1, String pala2, Set<String> lista) {
        if (pala1 == null || pala2 == null || pala1.length() != pala2.length() || lista== null || lista.size() == 0) {
            return 0;
        }
        for (String s:lista) {
            insert(s);
        }
        DFS(pala1,pala2, 1);
        return tam;
    }
    
    public void DFS(String pala1, String pala2, int paso) {
        if (paso>= tam)
            return;

        if (compare(pala1, pala2) == 0) {
            tam = Math.min(tam,paso);
            return;
        }
        if (compare(pala1,pala2) == 1) {
          tam= Math.min(tam,paso + 1);
          return;
        }

        for (int i = 0; i <pala1.length(); i++) {
            String s =pala1.substring(0, i + 1);
            HashMap<Character,Nodo> candidatos= obtenerActual(s);     
            if (candidatos == null) {
              s = pala1.substring(0, i);
              candidatos = obtenerHijo(s);
              if (candidatos == null) {
                continue;
              } 
            } 
            for (Map.Entry<Character,Nodo> entry : candidatos.entrySet()) {
              char c = entry.getKey();
              String newStr = pala1.substring(0,i) + c +pala1.substring(i+1);
              if (c !=pala1.charAt(i) && !entry.getValue().visit) {
                candidatos.get(c).visit = true;
                DFS(newStr,pala2,paso + 1);
              }
            }
        }
    }
    public void insert (String s){
      char[] arr = s.toCharArray();
      Nodo node = root;
      for (int i = 0; i < arr.length; i++) {
        char c = arr[i];
        if (!node.hijo.containsKey(c)) {
          node.hijo.put(c, new Nodo());
        }
        node = node.hijo.get(c);
        if (i == arr.length - 1) {
          node.isEnd = true;
          node.str = s;
        }
      }
    }
  
    public HashMap<Character,Nodo> obtenerActual(String s) {
        char[] arr = s.toCharArray();
        Nodo node = root;
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (!node.hijo.containsKey(c)) {
              return null;
            }
            if (i == arr.length - 1) {
                return node.hijo;
            }
            node = node.hijo.get(c);
        }
        return null;
    }
    public HashMap<Character,Nodo> obtenerHijo(String s) {
        if (s == null || s.length() == 0) {
          return root.hijo;
        }
        char[] arr = s.toCharArray();
        Nodo node = root;
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (!node.hijo.containsKey(c)) {
              return null;
            }
            node = node.hijo.get(c);
        }
        return node.hijo;
    }
    public int compare(String pala1, String pala2) {
      int cont = 0;
      for (int i = 0; i < pala1.length(); i++) {
        cont += pala1.charAt(i) != pala2.charAt(i) ? 1 : 0;
        if (cont > 1) {
          return cont;
        }
      }
      return cont;
    }

  public static void main(String[] args) {
    String pala1 = "words";//"hit";
    String pala2 = "graph";
    Set<String> set = new HashSet<String>();
    set.add("cords"); 
    set.add("corps"); 
    set.add("coops"); 
    set.add("crops"); 
    set.add("drops"); 
    set.add("drips"); 
    set.add("grips"); 
    set.add("gripe");
    set.add("grape"); 
    set.add("graph"); 
    
    Adyacencia a = new Adyacencia();
    int l = a.longitud(pala1,pala2, set);
    
    System.out.println("longitud"+l);
    System.out.println(set);
  }
}
 