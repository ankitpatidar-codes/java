public class LinkList {
    node head;

    public  class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(int data) {
        node newNode2 = new node(data);
        if (head == null) {
            head = newNode2;
            return;
        }
        newNode2.next = head;
        head = newNode2;
    }

    public void addLast(int data){
        node temp = new node(data);
        if(head ==null){
            head = temp;
            return;
        }
        node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;

        }
        currNode.next = temp;

    }

    public void printList(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + "  -->");
            temp = temp.next;
        }
        System.out.println("Null");

    }

        public static void main (String[]args){
            LinkList list = new LinkList();

            list.addFirst(10);
            list.printList();
            list.addLast(20);
            list.printList();



        }
    }
