package spring.crypto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.security.crypto.keygen.KeyGenerators;

public class TextEncryptorDemo implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(TextEncryptorDemo.class);
    }

    @Bean
    public TextEncryptor hexEncodingTextEncryptor() {
        String password = "hackme"; // should be kept in a secure place and not be shared
//        String salt = "8560b4f4b3"; // should be hex-encoded with even number of chars
        String salt = KeyGenerators.string().generateKey();
        return Encryptors.text(password, salt);
    }

    @Override
    public void run(String... args) throws Exception {
        TextEncryptor textEncryptor = hexEncodingTextEncryptor();
        String inputData = "hyperskill";
        String encryptedData = textEncryptor.encrypt(inputData);
        String decryptedData = textEncryptor.decrypt(encryptedData);

        System.out.println("Input data: " + inputData);
        System.out.println("Encrypted data: " + encryptedData);
        System.out.println("Decrypted data: " + decryptedData);
    }
}
