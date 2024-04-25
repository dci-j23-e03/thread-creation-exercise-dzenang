package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheculedNumbersExecutorExample {

  public static void main(String[] args) {

    ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

    // use the power of ScheduledExecutorService to achieve the same
    executorService.schedule(new EvenNumbersRunnable(), 0, TimeUnit.SECONDS);
    executorService.submit(new OddNumbersThread());

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted: " + Thread.currentThread().getName());
    }

    executorService.shutdownNow();
    System.out.println("End of main thread");
  }

}
