import java.util.concurrent.BlockingQueue;

public class ConsumerDeque implements Runnable {

    private final BlockingQueue<Integer> blockingQueue;


    public ConsumerDeque(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumer thread is Working" + blockingQueue.take());
            } catch (InterruptedException ex) {
                ex.printStackTrace();

            }
        }
    }
}
