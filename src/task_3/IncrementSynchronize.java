package task_3;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementSynchronize {
    private int value = 0;
    public int threadNumber = 4;

    public int getNextValueDefault() {
        return ++value;
    }

    public synchronized int getNextValueSynchronizedMethod() {
        return value++;
    }


    public int getNextValueSynchronizedThis() {
        synchronized(this){
            return ++value;
        }
    }

    public  int getNextValueAtomicInteger() {
        return new AtomicInteger(value).incrementAndGet();
    }
}
