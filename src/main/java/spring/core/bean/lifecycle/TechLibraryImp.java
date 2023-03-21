package spring.core.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
class TechLibraryImp implements InitializingBean, DisposableBean {
    private final List<String> bookTitles =
            Collections.synchronizedList(new ArrayList<>());

    @Override
    public void afterPropertiesSet() throws Exception {
        bookTitles.add("Clean Code");
        bookTitles.add("The Art of Computer Programming");
        bookTitles.add("Introduction to Algorithms");
        System.out.println("The library has been initialized: " + bookTitles);
    }

    @Override
    public void destroy() {
        bookTitles.clear();
        System.out.println("The library has been cleaned: " + bookTitles);
    }
}