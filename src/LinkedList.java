public class LinkedList<T> {
    Node<T> head;
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
    public void print(){
        Node<T> node = head;
        while (node.next != null){
            System.out.print(node.data+" -. ");
            node = node.next;
        }
        System.out.println(node.data);
    }
}
