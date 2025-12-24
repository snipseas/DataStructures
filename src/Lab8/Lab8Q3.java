
static class Link{
    public int data;
    public Link next;

    public Link(int data){
        this.data=data;
        this.next=null;
    }
}

public static class Lab8Q3 {

    public Link head = null;

    public Link insertAtIndex(int i, int v) {

        if (i < 0) {

            System.out.println("Invalid Index my nga");
            return head;
        }

        Link newNode = new Link(v);

        if(i==0){
            newNode = head;
            head = newNode;
            return head;
        }

        Link current = head;
        int count = 0;

        while(current!= null && count < i-1){

            current = current.next;
            count++;
        }


        if (current == null) {
            System.out.println("Invalid index");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;
        return head;



    }

    public void append(int data) {

        if(head == null){
            head = new Link(data);
            return;
        }

        Link current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Link(data);
    }

    public void printList(){

        Link current = head;
        while(current!= null){
            System.out.print(current.data);
            if(current.next!=null){
                System.out.print(" -> ");
            }
            current = current.next;

        }

    }
}



public static void main(String[] args){

    Lab8Q3 list = new Lab8Q3();
    list.append(10);
    list.append(20);
    list.append(30);
    list.printList();
    list.insertAtIndex(2,3);
    System.out.println();
    list.printList();
}
