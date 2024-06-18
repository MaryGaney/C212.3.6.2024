public class Counter1Tester {
    public static void main(String[] args) {

        // create counter object
        Counter1 concertCounter = new Counter1();

        // call increment three times
        concertCounter.increment();
        concertCounter.increment();
        concertCounter.increment();

        // display the current count
        System.out.println("The current count is " + concertCounter.getCount());

        concertCounter.reset();

        // display the current count after resetting
        System.out.println("The current count is " + concertCounter.getCount());

        // create another counter object
        Counter1 boardingCounter = new Counter1();

        // incement
        boardingCounter.increment();
        boardingCounter.increment();

        System.out.println("The current boarding counter is " + boardingCounter.getCount());

    }
}
