import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTemp extends TestUnit{
    @Test
    public void test1(){
        Set<Set<String>> set = Stream.of(new HashSet(), new HashSet(), new HashSet())
                .collect(Collectors.toSet());

    }
}
