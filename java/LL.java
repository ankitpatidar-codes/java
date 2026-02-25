public class LL {
    node head;

    // Creating a node which represent using class
    public class node {
        //In node we store data
        String data;
        //next node data
        node next;

        // Creating constructer in which String data will take
        node(String data) {
            this.data = data;
            //By deafult null for all
            this.next = null;

        }
    }

    // Adding operation in First place in Linklist
    public void addFirst(String data){
        node  newNode= new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //adding in last
    public void addLast(String data){
        node  newNode= new node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next =newNode;
    }
    // Print
    public void printList(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " ->" );
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }


    public static void main(String[] args) {
        LL list= new LL();
        //adding element in first in linklist
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

    }
}
