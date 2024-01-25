import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompleatableFutureExample {

    public String test() throws ExecutionException, InterruptedException {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Example").
                thenApplyAsync(ex -> ex + ex).thenApplyAsync(ex -> ex + "Test");

        return future.get();
    }
}
