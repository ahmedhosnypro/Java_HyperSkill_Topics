package spring.crypto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class NoOpPasswordEncoderDemo implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NoOpPasswordEncoderDemo.class);
    }
    @Override
    public void run(String... args) throws Exception {
        PasswordEncoder noOpEncoder = NoOpPasswordEncoder.getInstance();
        String rawPassword = "hackme";
        String encodedPassword = noOpEncoder.encode("hackme");
        boolean isMatched = noOpEncoder.matches(rawPassword, encodedPassword);

        System.out.println("Encoded password: " + encodedPassword);
        System.out.println("Match: " + isMatched);
    }
}
