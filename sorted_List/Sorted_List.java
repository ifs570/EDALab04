import java.util.ArrayList;
import java.util.List;

public class Sorted_List <T extends Comparable <T>> {
	
	Node <T> head=null;
	Node <T> sorted;
	
	
	public void generaListas(Integer data,ArrayList<Long>t) { // aqui mismo se realiza la toma de tiempo de ordenar y se guarda
		
		int aux=1;
		for (int i = 1; i <= data; i++) { // pone casos peores desde simple (1) al mas complejo(10)
			Sorted_List<Integer> lista = new Sorted_List<>();
			lista.worstCase(aux);//debe empezar por le mas simple ---> ejemplo 10 , otro de 10,9 , otro de 10,9,8
			aux++;
			lista.insertionSort(lista.head, t);
		}
		
		
	}
	public void worstCase(T data) {//crea una lista del peor caso a ordenar
		int num =1;
		Integer obj = (Integer) data;
		
		while(obj>0) {
			Integer data2 = num;
			Node<T> node = new Node<T>();// mantener el node creado si no solo se reemplaza
			node.setData((T) data2);
			node.setNext(head);
			head=node;
			obj--;
			num++;
		}
		
		
	}
	public void insertionSort( Node <T> ref,ArrayList<Long>t) {// el parametro es el nodo de la cabeza
		long inicio = System.nanoTime();
		sorted = null;
		Node <T> current= ref;
		while(current != null) {// basicamente el nodo que apunta la cabeza
			Node <T> next = current.getNext();// Coloca en next el nodo siguiente al que apunta la cabeza
			insertCompare(current);
			current=next;
			
		}
		t.add(System.nanoTime()-inicio);
		head=sorted;
	}
	public void insertCompare(Node <T> headAux) {// proceso que compara nodos y ordena
		
		if((sorted==null)||sorted.getData().compareTo(headAux.getData())>=0) {
			headAux.setNext(sorted);
			sorted= headAux;// el dato de sorted y headAux es 1 en ambos, ya no cumple la condicion
		}else {
			Node <T> current = sorted;
			while((current.getNext()!=null)&&(current.getNext().getData().compareTo(headAux.getData())>0)) {
				System.out.println("ehile");
				current=current.getNext();
			}
			headAux.setNext(current.getNext());
			current.setNext(headAux);
		}
	}
	public void display(Node <T> head) { // mostrar la lista
		while(head!=null) {
			System.out.print(head.getData()+", ");
			head=head.getNext();
		}
		System.out.println();
	}
	
}
