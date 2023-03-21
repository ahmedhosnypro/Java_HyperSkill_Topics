//package spring;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//
//import java.util.List;
//
//class Company {
//    private final String name;
//    private final List<String> employees;
//
//    Company(String name, List<String> employees) {
//        this.name = name;
//        this.employees = employees;
//    }
//
//    @Bean
//    public List<String> employees() {
//        return List.of(
//                "Lillia Barber",
//                "Todd Mcloughlin",
//                "Jasmine Wu"
//        );
//    }
//
//    // 1
//    @Bean
//    public Company company(@Autowired List<String> employees) {
//        return new Company("WorkProject", employees);
//    }
//}