package pl.com.marcinkowski.java14.thread;

public class MyWorker extends Thread{

    private Runnable jobToDo;
    private Thread afterThis;

    public MyWorker (String name, Runnable jobToDo, Thread afterThis){
        super(jobToDo);
        setName(name);
        this.jobToDo = jobToDo;
        this.afterThis = afterThis;
    }

    @Override
    public synchronized void start(){
        try {
            afterThis.join();
        } catch (InterruptedException e )
        {e.printStackTrace();
        } super.start();
    }
}
