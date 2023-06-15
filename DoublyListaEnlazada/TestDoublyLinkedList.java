public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList<Item> doublyLinkedList=new DoublyLinkedList<>();
		
		Item item1=new Item(10);
		Item item2=new Item(12);
		Item item3=new Item(50);
		Item item4=new Item(25);
		Item item5=new Item(59);
		Item item6=new Item(57);
		Item item7=new Item(23);
		Item item8=new Item(78);
		Item item9=new Item(11);
		Item item10=new Item(16);
		Item item11=new Item(57);
		Item item12=new Item(29);
		Item item13=new Item(105);
		Item item14=new Item(5);
		Item item15=new Item(1);
		Item item16=new Item(2);
	
	
		doublyLinkedList.add(item1);
		
		System.out.println(doublyLinkedList);
		System.out.println(" ");
		
		doublyLinkedList.add(item2);
		System.out.println(doublyLinkedList);
		System.out.println(" ");
		
		doublyLinkedList.addAtFirst(item3);
		System.out.println(doublyLinkedList);
		System.out.println(" ");
		
		doublyLinkedList.add(item4, 1);
		System.out.println(doublyLinkedList);
		System.out.println(" ");
		doublyLinkedList.add(item5);
		doublyLinkedList.add(item6);
		doublyLinkedList.addAtFirst(item7);
		doublyLinkedList.add(item8);
		System.out.println(doublyLinkedList);
		doublyLinkedList.addAtFirst(item9);
		doublyLinkedList.add(item10);
		doublyLinkedList.addAtFirst(item11);
		doublyLinkedList.add(item12);
		doublyLinkedList.addAtFirst(item13);
		doublyLinkedList.add(item14);
		doublyLinkedList.addAtFirst(item15);
		doublyLinkedList.add(item16);
		System.out.println(" ");
		System.out.println(doublyLinkedList);
		
	}	
}
