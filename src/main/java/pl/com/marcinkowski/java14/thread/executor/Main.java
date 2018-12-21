package pl.com.marcinkowski.java14.thread.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

    public static void main(String[] args) {

        Runnable job = () -> {
            for (int i = 0; i < 100; i++){
                System.out.println(String.format("i = [%d], run by: [%s]", i ,Thread.currentThread().getName()));
            }
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 100 ; i++) {
            executor.execute(job);
        }

        executor.shutdown();
        executor.execute(job);

        ExecutorService terminators = Executors.newFixedThreadPool(40);
        for (int i = 0; i < 100; i++) {
            terminators.execute(job);
        }
        terminators.shutdown();

        Executor terminators2 = Executors.newScheduledThreadPool(4);
        for (int i = 0; i < 100; i++){
            terminators.execute(job);
        }



    }
}
