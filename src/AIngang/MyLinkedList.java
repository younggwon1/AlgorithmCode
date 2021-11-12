package AIngang;

public class MyLinkedList<T> {

	public static class DoubleLinkedList<T> {
		public Node<T> head = null; // 노드 head
		public Node<T> tail = null; // 노드 tail
		
		public class Node<T> {
			T data;
			Node<T> prev = null; // 앞에 있는 노드를 가리키는 포인터
			Node<T> next = null; // 뒤에 있는 노드를 가리키는 포인터
			
			public Node(T data) {
				this.data = data;
			}
		}
	    
	    // 데이터를 추가하는 메서드
	    public void addNode(T data) {
	        if(this.head == null) {
	            this.head = new Node<T>(data);
	            this.tail = this.head;
	        } else {
	            Node<T> node = this.head;
	            while (node.next != null) {
	                node = node.next;
	            }
	            node.next = new Node<T>(data);
	            node.next.prev = node;
	            this.tail = node.next;
	        }
	    }
	    
	    // 모두 출력
	    public void printAll() {
	    	if(head != null) {
	    		Node<T> node = this.head;
	    		System.out.println(node.data);
	    		
	    		while (node.next != null) {
	    			node = node.next;
	    			System.out.println(node.data);
	    		}
	    	}
	    }
	    
	    // head부터 특정 노드를 찾는 메서드 추가하기
	    public T searchFromHead(T isData) {
	        if(this.head == null) {
	            return null;
	        } else {
	            Node<T> node = this.head;
	            while(node != null) {
	                if(node.data == isData) {
	                    return node.data;
	                } else {
	                    node = node.next;
	                }
	            }
	            return null;
	        }
	    }
	    
	    // tail부터 특정 노드를 찾는 메서드 추가하기
	    public T searchFromTail(T isData) {
	        if(this.head == null) {
	            return null;
	        } else {
	            Node<T> node = this.tail;
	            while(node != null) {
	                if(node.data == isData) {
	                    return node.data;
	                } else {
	                    node = node.prev;
	                }
	            }
	            return null;
	        }
	    }
	    
	    // 데이터를 임의 노드 앞에 노드를 추가하는 메서드 추가하기
	    // 노드 추가에 성공 = true , 노드 추가에 실패 = false
	    public boolean insertToFront(T existedData, T addData) {
	    	if(this.head == null) {
	    		this.head = new Node<T>(addData);
	    		this.tail = this.head;
	    		return true;
	    	} else if(this.head.data == existedData) {
	    		Node<T> newHead = new Node<T>(addData);
	    		newHead.next = this.head;
	    		this.head = newHead;
	    		return true;
	    	} else {
	    		Node<T> node = this.head;
	    		while(node != null) {
	    			if(node.data == existedData) {
	    				Node<T> nodePrev = node.prev;
	    				
	    				nodePrev.next = new Node<T>(addData);
	    				nodePrev.next.next = node;
	    				
	    				nodePrev.next.prev = nodePrev;
	    				node.prev = nodePrev.next;
	    				
	    				return true;
	    			} else {
	    				node = node.next;
	    			}
	    		}
	    		return false;
	    	}
	    }
	}
	
	public static void main(String[] args) {
		DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();

        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.insertToFront(3, 2);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.insertToFront(6, 2);
        MyLinkedList.insertToFront(1, 0);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.addNode(6);
        MyLinkedList.printAll();
	}
}
