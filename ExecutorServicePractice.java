import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class ExecutorServicePractice {

 ExecutorService executorService = Executors.newFixedThreadPool(2);
 ArrayList<Integer> integerList = new ArrayList<>();

 void test () {
     for (int i = 0; i < 100; i++) {
     integerList.add(i);
     }

     List<Integer> partition = integerList.subList(0, integerList.size()/2);
     List<Integer> partition2 = integerList.subList(partition.size(), integerList.size());
     executorService.execute(() -> System.out.println(partition));
     executorService.execute(() -> System.out.println(partition2));
 }


}
