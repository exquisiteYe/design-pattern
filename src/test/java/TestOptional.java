import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import xyDemo.dto.User;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestOptional extends TestUnit{
    @Autowired
    private User user;

    @Test(expected = NoSuchElementException.class)
    public void whenCreateEmptyOptional_thenNull() {
        Optional<User> emptyOpt = Optional.empty();
        emptyOpt.get();
    }

    @Test(expected = NullPointerException.class)
    public void whenCreateOfEmptyOptional_thenNullPointerException() {
        Optional<User> opt = Optional.of(user);
        opt.get();
    }

    @Test
    public void whenCreateOfNullableOptional_thenOk() {
        String name = "John";
        Optional<String> opt = Optional.ofNullable(name);

        assertEquals("John", opt.get());
    }

    @Test
    public void whenCheckIfPresent_thenOk() {
        User user = new User("john@gmail.com", "1234");
        Optional<User> opt = Optional.ofNullable(user);
        // 检查是否有值的另一个选择是 ifPresent() 方法
        assertTrue(opt.isPresent());
        assertEquals(user.getEmail(), opt.get().getEmail());
    }

    @Test
    public void whenCheckIfPresent_thenOk2() {
        User user = new User("john@gmail.com", "1234");
        Optional<User> opt = Optional.ofNullable(null);
        // 上面两句可以替换为下面一句
        opt.ifPresent( u -> assertEquals(user.getEmail(), u.getEmail()));
    }
}
