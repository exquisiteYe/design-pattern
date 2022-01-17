import com.fasterxml.jackson.databind.util.ArrayIterator;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTemp extends TestUnit{
    @Test
    public void test1(){
        Set<Set<String>> set = Stream.of(new HashSet<String>(), new HashSet<String>(), new HashSet<String>())
                .collect(Collectors.toSet());

    }

    @Test
    public void test2(){
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 20; i ++) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
    }
}
