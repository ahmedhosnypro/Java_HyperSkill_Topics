package spring.core.bean.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
class TechLibrary {
    private final List<String> bookTitles =
            Collections.synchronizedList(new ArrayList<>());

    @PostConstruct
    public void init() {
        bookTitles.add("Clean Code");
        bookTitles.add("The Art of Computer Programming");
        bookTitles.add("Introduction to Algorithms");
        System.out.println("The library has been initialized: " + bookTitles);
    }

    @PreDestroy
    public void destroy() {
        bookTitles.clear();
        System.out.println("The library has been cleaned: " + bookTitles);
    }
}