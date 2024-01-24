import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Thread producerBlockingQueue = new Thread(new ProducerDqueue(blockingQueue));
        Thread consumerBlockingQueue = new Thread(new ConsumerDeque(blockingQueue));
        producerBlockingQueue.start();
        consumerBlockingQueue.start();
    }

}
