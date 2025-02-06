public class MultiThreading {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("active thread count is "+Thread.activeCount());
        System.out.println("current thread name is "+Thread.currentThread().getName());//returns the current thread name
        System.out.println("active thread id is "+Thread.currentThread().getId());
    }
}
