import java.util.concurrent.CompletableFuture;

public class future {


    public static CompletableFuture<Void> getRunnable(){
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Hello");
        });
        return future;
    }

    public static CompletableFuture<String> getCustomerDetails() {

        CompletableFuture<String> completableFuture =  CompletableFuture.supplyAsync(() -> {
            return "Vikrant Kumar";
        });
        System.out.println("This is the future");
        return  completableFuture;
    }

    public static void main(String[] args) {
        CompletableFuture<Void> future = getRunnable();
        CompletableFuture<String> customerDetails = getCustomerDetails();
        System.out.println("This is the main");
        future.join();
        System.out.println(customerDetails.join());
    }
}
