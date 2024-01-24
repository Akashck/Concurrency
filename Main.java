import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Queue<Integer> queue = new LinkedList<>();
        int max = 5;
        Thread producerBlockingQueue = new Thread(new ProducerDqueue(blockingQueue));
        Thread consumerBlockingQueue = new Thread(new ConsumerDeque(blockingQueue));
        producerBlockingQueue.start();
        consumerBlockingQueue.start();
      //  Thread produerWithQueue = new Thread(new ProducerWithWait(queue, max));
     //   Thread consumerWithQueue = new Thread(new ConsumerWithWait(queue));
     //   produerWithQueue.start();
     //   consumerWithQueue.start();
    }

}
