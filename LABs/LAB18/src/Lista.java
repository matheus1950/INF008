import java.util.ArrayList;

public class Lista {
	ArrayList<Object> lista = new ArrayList<Object>();
	
	
	public Lista(ArrayList<Object> lista) {
		super();
		this.lista = lista;
	}

	public int putObj(Object obj) {
		lista.add(obj);
		return lista.indexOf(obj);
	}
	
	public void remObj(int indice) {
		lista.remove(indice);
	}
	
	public int posObj(Object obj) {
		return lista.indexOf(obj);
	}
	
	public boolean temObj(Object obj) {
		return lista.contains(obj);
	}
	
	public boolean isEmpty(int indice){
		if(indice < 0 || indice >= lista.size())
			return true;
		else
			return (lista.get(indice) == null); 
	}
	
	public boolean isEmpty() {
		return lista.isEmpty();
	}
	
	public int tamanho() {
		int i = 0;
		for(Object cont : lista) {
			if(cont != null)
				i++;
		}
		return i;
	}
	
	
}
