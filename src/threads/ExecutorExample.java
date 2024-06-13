package threads;

import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2, // core pool size
                4, // maximum pool size
                60, // time to keep idle threads alive
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2), // work queue with a capacity of 2
                handler
        );

        for (int i = 0; i < 500; i++) {
            executor.execute(new Task(i));
        }
        executor.shutdown();
    }

    static class Task implements Runnable {
        private int taskId;
        public Task(int id) {
            this.taskId = id;
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+ "  " + taskId +" is executing the task");
            try {
                Thread.sleep(20); // simulate task execution time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//30 Fixed + 10% Variable  + allowance + joining bonus
