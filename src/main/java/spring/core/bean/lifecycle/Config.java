package spring.core.bean.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
class Config {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public TechLibrary library() {
        return new TechLibrary();
    }

    static class TechLibrary {
        private final List<String> bookTitles =
                Collections.synchronizedList(new ArrayList<>());

        public void init() {
            bookTitles.add("Clean Code");
            bookTitles.add("The Art of Computer Programming");
            bookTitles.add("Introduction to Algorithms");
            System.out.println("The library has been initialized: " + bookTitles);
        }

        public void destroy() {
            bookTitles.clear();
            System.out.println("The library has been cleaned: " + bookTitles);
        }
    }
}

