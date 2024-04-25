package org.example;

public class Main {

  public static void main(String[] args) {

    Thread oddNumbersThread = new OddNumbersThread();
    // we can use one of these two ways
//    Thread evenNumbersThread = new Thread(new EvenNumbersRunnable());
    Thread evenNumbersThread = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 2; i <= 10; i += 2) {
          System.out.println("EvenNumbersRunnable: " + i);
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            System.out.println("EvenNumbersThread interrupted!");
            break;
          }
        }
      }
    });

    oddNumbersThread.start();
    evenNumbersThread.start();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted: " + Thread.currentThread().getName());
    }

    oddNumbersThread.interrupt();
  }
}
