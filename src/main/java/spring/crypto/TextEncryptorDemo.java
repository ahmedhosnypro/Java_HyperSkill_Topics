package spring.crypto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.encrypt.Encryptors;

public class TextEncryptor implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(TextEncryptor.class);
    }

    @Bean
    public TextEncryptor hexEncodingTextEncryptor() {
        String password = "hackme"; // should be kept in a secure place and not be shared
        String salt = "8560b4f4b3"; // should be hex-encoded with even number of chars
        return Encryptors.text(password, salt);
    }
    @Override
    public void run(String... args) throws Exception {

    }
}
