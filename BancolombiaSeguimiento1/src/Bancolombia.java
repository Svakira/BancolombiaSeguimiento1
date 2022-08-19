public class Bancolombia {
    private Person head;
    private Person current;
    private int actualTurn=1;
    public void addLast(Person input) {
        if (head == null) {
            head = input;
            head.setNext(input);
            head.setPrev(input);
            current=head;
            System.out.println("guardada");
        } else {

            Person tail = head.getPrev();
            tail.setNext(input);
            input.setNext(head);
            //enlaces previous
            head.setPrev(input);
            input.setPrev(tail);
            System.out.println("guardado");
        }
    }

    public void actualTurn() {
        if (head == null) {
            System.out.println("There are no more turns");
        }
        System.out.println("actual turn is :" + current.getTurn()+" "+current.getName());
    }



    public void pass() {
        if(head==null){
            System.out.println("no hay turnos");
        }
        else{
            current = current.getNext();
        }

    }

    public void deletebyturn(int goal) {
        deletebyturn(head, goal);
    }

    public void deletebyturn(Person current, int goal) {
        if (goal == head.getTurn()) {
            Person prev = current.getPrev();
            Person next = current.getNext();
            prev.setNext(next);
            next.setPrev(prev);
            head = next;
            System.out.println("Turn eliminated correctly 1");

        }
        if (current.getTurn() == goal) {
            Person prev = current.getPrev();
            Person next = current.getNext();
            prev.setNext(next);
            next.setPrev(prev);
            System.out.println("Turn eliminated correctly");
        }
        if (current.getNext() == head) {
            return;

        }
        deletebyturn(current.getNext(), goal);
    }
}
