package org.example;

public class Main {

  public static void main(String[] args) {

    Thread oddNumbersThread = new OddNumbersThread();
    Thread evenNumbersThread = new Thread(new EvenNumbersRunnable());

    oddNumbersThread.start();
    evenNumbersThread.start();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted: " + Thread.currentThread().getName());
    }

    oddNumbersThread.interrupt();
    evenNumbersThread.interrupt();
    System.out.println("End of main thread");
  }
}
