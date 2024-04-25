# thread_creation_exercise

- Your task is to create two threads.
- You should make one thread subclass of java.lang.Thread class.
- The other should be created using a Runnable, which you can pass to the Thread constructor. This can be any class that implements Runnable, or annonymous inner class.
- Each thread should have a run method. The first thread's code should print 5 even numbers, and the second thread should print 5 odd numbers.
- You should execute them anynchronously, calling the start method on each, in two consecutive statements in your main code.
- Have your main method, after these threads run a few seconds, interrupt one or both of these threads (call interrupt() method).
    - NOTE: You might need to 'slow down' thread execution a little, to be able to interrupt a thread. Consider adding some calls to sleep method. 
- Make sure to have proper handling for InterruptedException.
