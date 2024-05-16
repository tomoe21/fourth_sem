package error_handling;
class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class q17 {

	static class LinkedListExample {
		private Node head;
		int size=0;
		public LinkedListExample() {
			this.head = null;
		}
		public void insert(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
			} else {
				Node current = head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = newNode;
			}
			size++;
		}
		public int getElementAtIndex(int index) {
			if (head == null || index < 0 || index>size) {
				throw new ArrayIndexOutOfBoundsException("Index out of bounds");
			}
			Node current = head;
			for (int i = 0; i < index; i++) {
				if (current.next == null) {
					throw new ArrayIndexOutOfBoundsException("Index out of bounds");
				}
				current = current.next;
			}
			return current.data;
		}
		public static void main(String[] args) {

			LinkedListExample linkedList = new LinkedListExample();
			linkedList.insert(10);
			linkedList.insert(20);
			linkedList.insert(30);
			try {
				System.out.println("Element at index 0: " + linkedList.getElementAtIndex(0));
				System.out.println("Element at index 1: " + linkedList.getElementAtIndex(1));
				System.out.println("Element at index 2: " + linkedList.getElementAtIndex(2));
				System.out.println("Element at index 3: " + linkedList.getElementAtIndex(3));
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
			}
		}
	}
}
