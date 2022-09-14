public class LinkedList<T> {
    Node<T> head;
    //uc1
    public void add(T data){
        Node<T> newNode =new Node<>();
        newNode.data = data;
        if(head== null){
            head =newNode;

        }else{
            Node<T>node = head;
            while (node.next !=null){
                node = node.next;

            }
            node.next=newNode;
        }
    }
    //Uc3
    public void addAtStart(T data) {
        // head -> 30 40 50 -> null
        // 100 null
        Node<T> newNode = new Node<>();
        newNode.data = data;
        newNode.next = head;

        // 100 -> 30 40 50 -> null
        head = newNode;
        // head -> 100 -> 30 40 50 -> null
    }
    public void addAt(int index, T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if(index == 0) {
            addAtStart(data);
        } else {
            // head -> 30 79 40 50 -> null
            // index -> 2 data -> 79
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }}
    public void print(){
        Node<T> node = head;
        while (node.next != null){
            System.out.print(node.data+" -. ");
            node = node.next;
        }
        System.out.println(node.data);
    }
        public void print(int index) {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            System.out.println(node.data);
        }
}
