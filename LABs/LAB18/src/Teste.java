import java.util.ArrayList;

public class Teste {

	public static void main(String[] args){
		ArrayList<Object> teste = new ArrayList<Object>();
		
		Lista lista = new Lista(teste);
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println("===colocando itens===");
		System.out.println(lista.putObj(obj));
		System.out.println(lista.putObj(obj2));
		
		System.out.println("===removendo item por índice===");
		lista.remObj(0);
		System.out.println("Verificando: " + lista.temObj(obj));
		
		System.out.println("===indice do objeto===");
		System.out.println(lista.posObj(obj2));
		
		
		System.out.println("===verificando se o objeto existe na lista===");
		System.out.println(lista.posObj(obj2));
		System.out.println(lista.posObj(obj));
		
		
		System.out.println("===se a lista está vazia no índice===");
		System.out.println("-indice 0");
		System.out.println(lista.isEmpty(0));
		System.out.println("-indice 3");
		System.out.println(lista.isEmpty(3));
		System.out.println("*adição de null no indice 1");
		lista.putObj(null);
		System.out.println("*adição de object no indice 2");
		lista.putObj(new Object());
		System.out.println("-indice 1");
		System.out.println(lista.isEmpty(1));
		System.out.println("-indice 2");
		System.out.println(lista.isEmpty(2));
		
		System.out.println("===tamanho da lista(objetos não nulos)===");
		System.out.println(lista.tamanho());
		
		System.out.println("===se a lista está vazia===");
		System.out.println(lista.isEmpty());
		System.out.println("*agora limpando a lista");
		lista.lista.clear();
		System.out.println(lista.isEmpty());

	}

}
