package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumbersExecutorExample {

  public static void main(String[] args) {

    ExecutorService executorService = Executors.newFixedThreadPool(2);

    executorService.submit(new EvenNumbersRunnable());
    executorService.execute(new OddNumbersThread());

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted: " + Thread.currentThread().getName());
    }

    executorService.shutdownNow();
    System.out.println("End of main thread");
  }

}
