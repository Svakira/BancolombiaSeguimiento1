public class Person {
    private int turn;
    private String name;

    private Person next;
    private Person prev;

    public Person(int turn, String name) {
        this.turn = turn;
        this.name = name;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    public Person getPrev() {
        return prev;
    }

    public void setPrev(Person prev) {
        this.prev = prev;
    }


}
