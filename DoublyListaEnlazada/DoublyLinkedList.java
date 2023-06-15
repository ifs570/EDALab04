public class DoublyLinkedList<T>{
	private int size;
	private DoublyNode<T> root;
	
	
	public void add(T data) {
		if (data == null) {
			return;
		}

		if (root == null) {
			root = new DoublyNode<T>(data);
		} else {
			DoublyNode<T> newNode = new DoublyNode<T>(data);
			DoublyNode<T> lastNode = getLastNode(root);
			lastNode.setNext(newNode);
			newNode.setPrevious(lastNode);
		}
		size++;
	}
	/**
	 * Agregar elemento al principio.
	 */
	public void addAtFirst(T data) {
		if (data == null) {
			return;
		}
		DoublyNode<T> newNode = new DoublyNode<T>(data);
		if (this.root != null) {
			this.root.setPrevious(newNode);
			newNode.setNext(this.root);
			this.root = newNode;
		} else {
			this.root = newNode;
		}
		size++;
	}
	
	/**
	* Agregue el elemento en el índice especificado. El índice comienza de 0 a n-1 donde n = tamaño de
	* lista enlazada. Si el índice es un valor negativo, no se agregará nada al vínculo
	* lista.
	
	* si el índice = 0, el elemento se agregará en el encabezado y el elemento se convertirá en el primero
	* nodo.
	 */
	public void add(T data, int index) throws IndexOutOfBoundsException {
		if (data == null) {
			return;
		}
		// If index=0 , we should add the data at head
		if (index == 0) {
			addAtFirst(data);
			return;
		}
		// If index= size, we should add the data at last
		if (index == this.size) {
			add(data);
		} else if (index < this.size) {
			DoublyNode<T> newNode = new DoublyNode<T>(data);
			// obtener el nodo en (índice) de la lista enlazada y marcarlo como rightNode.
			// obtener el nodo en (índice-1) de la lista enlazada y marcarlo como leftNode.
			// establece el nodo del nodo recién creado como nodo derecho.
			// establece el nodo del nodo izquierdo como Nodo recién creado.
			DoublyNode<T> rightNode = getNode(index);
			DoublyNode<T> leftNode = rightNode.getPrevious();
			leftNode.setNext(newNode);
			newNode.setPrevious(leftNode);
			newNode.setNext(rightNode);
			rightNode.setPrevious(newNode);
			size++;
		} else {
			throw new IndexOutOfBoundsException("Indice no disponible.");
		}
	}
	
	private DoublyNode<T> getNode(int index) {

		if (index < 0 || index > this.size - 1) {
			throw new IndexOutOfBoundsException("Indice no disponible");
		}
		
		if (index == 0) {
			return this.root;
		}
		// If index= size, return last node
		if (index == this.size - 1) {
			return getLastNode(this.root);
		}
		int pointer = 0;
		DoublyNode<T> pointerNode = this.root;
		while (pointer <= index) {
			if (pointer == index) {
				return pointerNode;
			} else {
				pointerNode = next(pointerNode);
				pointer++;
			}
		}
		return null;
	}
	
	//Metodo

	//public void insertionSort() {
		
	//}
	
	private DoublyNode<T> getLastNode(DoublyNode<T> node) {
	      if(node !=null) {
			DoublyNode<T> lastNode = node;
			if (lastNode.getNext() != null) {
				return getLastNode(lastNode.getNext());
			} else {
				return lastNode;
			}
	      }
	      return null;
		}

	private DoublyNode<T> next(DoublyNode<T> node) {
		if (node.getNext() != null) {
			return node.getNext();
		} else {
			return null;
		}
	}

	public int size() {
		return this.size;
	}

	public void clear() {
		this.root = null;
		this.size = 0;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof DoublyLinkedList))
			return false;
		DoublyLinkedList other = (DoublyLinkedList) obj;
		if (root == null) {
			if (other.root != null)
				return false;
		} else if (!root.equals(other.root))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	

	
	
	
	public String toString() {
		String represent= " ";
		DoublyNode<T> nextNode = this.root;
		while (nextNode != null) {
			represent = represent + nextNode.toString();
			nextNode = next(nextNode);
			if (nextNode != null) {
				represent = represent + ",";
			}
		}
	
		return represent;
	}
}
