import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Queue<Integer> queue = new LinkedList<>();
        int max = 5;
        Thread producerBlockingQueue = new Thread(new ProducerDqueue(blockingQueue));
        Thread consumerBlockingQueue = new Thread(new ConsumerDeque(blockingQueue));
        producerBlockingQueue.start();
        consumerBlockingQueue.start();
        Thread produerWithQueue = new Thread(new ProducerWithWait(queue, max));
        Thread consumerWithQueue = new Thread(new ConsumerWithWait(queue));
        produerWithQueue.start();
        consumerWithQueue.start();
        ExecutorServicePractice practice = new ExecutorServicePractice();
        practice.test();

        CompleatableFutureExample futureExample = new CompleatableFutureExample();
        System.out.println(futureExample.test());*/
        LogicalProblems lp = new LogicalProblems();
        List<Employee> empl = lp.createEmployee();
        lp.employeeByHR(empl,"HR");
        lp.employeesTopTwoSalary(empl);
        lp.sortOnAge(empl);

    }

}
