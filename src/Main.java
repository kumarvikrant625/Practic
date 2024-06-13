import java.beans.BeanProperty;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class Main{

    public static void main(String[] args) throws InterruptedException {
        Stream<String> names;
        names = Stream.of("aBc", "d", "ef", "4234234234", "0909");
        IntSummaryStatistics summary = names.mapToInt(name-> name.length()).summaryStatistics();
        System.out.println(summary.getMax());
        System.out.println(summary.getMin());
        System.out.println(summary.getAverage());
        System.out.println(summary.getCount());
        System.out.println(summary.getSum());

        Runnable r = () ->{
            for (int i = 0; i < 100; i++) {
                System.out.println("Child Thread"+ i);
            }
        };
        Thread t = new Thread(r);
        t.start();
        Thread.currentThread().join();
        System.out.println("Main Thread");


    }
}