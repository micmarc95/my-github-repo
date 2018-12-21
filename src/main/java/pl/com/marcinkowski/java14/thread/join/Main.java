package pl.com.marcinkowski.java14.thread.join;

public class Main {
    public static void main(String[] args) {
        System.out.println("main() - begins!!");

        Runnable job = () -> {
            for (int i = 0; i < 100; i++){
                System.out.println(String.format("i = [%d], run by: [%s]", i ,Thread.currentThread().getName()));
            }
        };

        Thread worker = new Thread(job);
//        worker.setDaemon(true);
        Thread worker2 = new Thread(job);
        Thread worker3 = new Thread(job);

        worker.start();
        worker2.start();
        worker3.start();

        try {
            worker.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(1500);  //workerów można uśpić tylko w jobie. Thread sleep wywoływay w mainie usypia zawsze wątek mainowy
            worker3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main() - ends!!");
    }
}
