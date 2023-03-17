package Tests;

import myutil.*;

public class Main {
	public static void main(String[] args) {
		// Skapa noderna och länka dem ihop
		//        Node<Integer> node1 = new Node<>(1);
		//        Node<Integer> node2 = new Node<>(2, node1);
		//        Node<Integer> node3 = new Node<>(3, node2);
		MyStack<Integer> MyStack1 = new MyStack<>();
		MyQueue<Integer> MyQueue1 = new MyQueue<>();
		MyList<Integer> MyList1 = new MyList<>();



		// Hämta data från noderna och skriv ut
		//        System.out.println(node1.getData()); // 1
		//        System.out.println(node2.getData()); // 2
		//        System.out.println(node3.getData()); // 3
		System.out.println("My stack");
		MyStack1.push(60);
		MyStack1.push(8);
		MyStack1.push(157);
		System.out.println(MyStack1.pop());
		System.out.println(MyStack1.pop());
		if (MyStack1.isEmpty()) {
			System.out.println("The stack is empty");
		}else {
			System.out.println("The stack isn´t empty");
		}
		System.out.println("My Queue");
		MyQueue1.enqueue(2); 
		MyQueue1.enqueue(55); 
		MyQueue1.enqueue(5); 
		MyQueue1.dequeue();
		System.out.println(MyQueue1.dequeue());
		System.out.println(MyQueue1.size());

		System.out.println("My List");
		//   MyList1.add(null);
		MyList1.add(3);
		MyList1.add(5);
		MyList1.add(9);
		MyList1.add(4);
		MyList1.add(7);
		MyList1.add(1);

		try {
			System.out.println(MyList1.getElementAt(5));
		} catch (ElementNotThereException e) {
			System.out.println("no element at that index");
		}


		// Hämta data från noderna via länkarna och skriv ut
		//        System.out.println(node3.getNext().getData()); // 2
		//        System.out.println(node3.getNext().getNext().getData()); // 1

		// Loopa över kedjan och skriv ut alla värden
		//        Node<Integer> currentNode = node3;
		//        while (currentNode != null) {
		//        	System.out.println(currentNode.getData());
		//        	currentNode = currentNode.getNext();
		//        }
	}
}