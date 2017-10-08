import com.sbt.javaschool.api.ThreadPool;
import com.sbt.javaschool.impl.FixedThreadPool;

public class Main {
    public static void main(String[] args) {
        ThreadPool threadPool = new FixedThreadPool(5);
        SomeTask someTask=new SomeTask();
        threadPool.execute(someTask);
        threadPool.execute(someTask);
        threadPool.start();

    }
}
