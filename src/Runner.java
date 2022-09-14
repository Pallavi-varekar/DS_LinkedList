public class Runner {
    public static void main(String[] args) {

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.addAtStart(70);
        integerLinkedList.print();
        integerLinkedList.addAtStart(30);
        integerLinkedList.print();
        integerLinkedList.addAtStart(56);

        integerLinkedList.print();
       integerLinkedList.addAt(1,56);
        integerLinkedList.print();
        integerLinkedList.deleteAtStart();
        integerLinkedList.print();
        integerLinkedList.addAt(2,40);
        integerLinkedList.print();
        integerLinkedList.deleteAt(2);
        integerLinkedList.print();

    }


    }

