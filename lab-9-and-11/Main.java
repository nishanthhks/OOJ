class DisplayThread extends Thread {
    private String message;
    private int interval;
    private volatile boolean running = true;

    public DisplayThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }
    public void stopthread(){
        running = false;
    }
    public void run() {
        while (running) {
            System.out.println(message);
            try {
                Thread.sleep(interval * 1000);  // Convert seconds to milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create threads
        DisplayThread thread1 = new DisplayThread("BMS College of Engineering", 10);
        DisplayThread thread2 = new DisplayThread("CSE", 2);
        
        // Start threads
        thread1.start();
        thread2.start();

        //sleep for some time(ex: 30 sec) to let the thread run
        try {
            Thread.sleep(30*1000);   //Convert seconds to milli-seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.stopthread();
        thread2.stopthread();
    }
}
