package hello;

import java.net.URLClassLoader;
import java.util.Vector;

import org.junit.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.util.ReflectionTestUtils;

public class CreateApplicationTests {

    @Test
    public void contextLoads() {
        System.err.println(count());
        new SpringApplicationBuilder(Empty.class).web(false).run().close();
        System.err.println(count());
        new SpringApplicationBuilder(Empty.class).web(false).run().close();
        System.err.println(count());
        new SpringApplicationBuilder(Empty.class).web(false).run().close();
        System.err.println(count());
        new SpringApplicationBuilder(Empty.class).web(false).run().close();
        System.err.println(count());
    }

    private int count() {
        URLClassLoader classLoader = (URLClassLoader)CreateApplicationTests.class.getClassLoader();
        @SuppressWarnings("unchecked")
        Vector<Class<?>> classes = (Vector<Class<?>>) ReflectionTestUtils.getField(classLoader, "classes");
        return classes.size();
    }

    @Configuration
    protected static class Empty {

    }

}
