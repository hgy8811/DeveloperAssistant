package per.gehu.common.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by huguoyin on 17/4/21.
 * 避免 new Thread 泛滥
 */
public class ThreadUtils {
    private  static ExecutorService sThreadExecutor = Executors.newFixedThreadPool(5);
    public static void execute(Runnable runnable){
        sThreadExecutor.execute(runnable);
    }
}
