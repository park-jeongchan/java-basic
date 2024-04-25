package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter(3);
        maxCounter.increament();
        maxCounter.increament();
        maxCounter.increament();
        maxCounter.increament();
        int count = maxCounter.getCount();
        System.out.println(count);
    }
}
