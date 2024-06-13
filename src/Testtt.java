import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Testtt {
   static final int threshold = 1000;

        /**
         * Don't change this method.
         */
        public static int getSum(List<Integer> value) {
            int sum=0;
            for(int i: value){
                sum+=i;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            return sum;
        }
        public static List<Callable> divideAndSum(List<Integer> list){

            List<Callable> callables = new ArrayList<>();
            if(list.size()> threshold){
                int size = list.size()/ threshold;
                int start = 0;
                for(int i=1; i<=size; i++) {
                    List<Integer> first = list.subList(start, i * threshold);
                    start = i * threshold;
                    Callable<Integer> callable = () -> {
                        return getSum(first);
                    };
                    callables.add(callable);
                }
            }else{
                Callable<Integer> callable = () -> {
                    return getSum(list);
                };
                callables.add(callable);
            }
            return callables;

        }
        public static void main(String[] args) {
            List<Integer> list =  IntStream.rangeClosed(1, 100000)
                    .boxed()
                    .map(n -> ThreadLocalRandom.current().nextInt(0, 11))
                    .collect(Collectors.toList());
            long start1 = System.currentTimeMillis();

            int threshold = 200;
           List<Callable> callables =  divideAndSum(list);
           List<Future<Integer>> value = new ArrayList<>();
           ExecutorService executor= Executors.newFixedThreadPool(list.size()/threshold);
            for (int i = 0; i < callables.size(); i++) {
                value.add( executor.submit(callables.get(i)));
            }
            do{
            }while (value.stream().allMatch(Future::isDone));

            int finalSum = value.stream().map(future -> {
                try {
                    return future.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }).mapToInt(Integer::intValue).sum();
            executor.shutdown();
            System.out.println("Executed in : "+(System.currentTimeMillis()-start1) + ", sum is : " + finalSum);
            start1 = System.currentTimeMillis();
            int sum1 = Testtt.getSum(list);
            System.out.println("Executed in : "+(System.currentTimeMillis()-start1) + ", sum is : " + sum1);
        }

    }
