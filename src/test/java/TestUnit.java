import org.junit.Test;

import java.util.*;


public class TestUnit {

    public static <E extends List<E>> E max(Set<E> c){
        if(c.isEmpty()){
            throw new IllegalArgumentException("empty collection");
        }
        E result = null;
        for(E e:c){
            if(result == null){
                Objects.requireNonNull(result = e);
            }
        }
        return result;
    }


}



