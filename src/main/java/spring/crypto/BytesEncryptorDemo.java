package spring.crypto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.encrypt.BytesEncryptor;
import org.springframework.security.crypto.encrypt.Encryptors;

@SpringBootApplication
public class BytesEncryptorDemo implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BytesEncryptorDemo.class);
    }

    @Bean
    public BytesEncryptor aesBytesEncryptor() {
        String password = "hackme"; // should be kept in a secure place and not be shared
        String salt = "8560b4f4b3"; // should be hex-encoded with even number of chars
        return Encryptors.standard(password, salt);
    }

    @Override
    public void run(String... args) throws Exception {
        BytesEncryptor bytesEncryptor = aesBytesEncryptor();

        byte[] inputData = {104, 121, 112, 101, 114, 115, 107, 105, 108, 108};
        byte[] encryptedData = bytesEncryptor.encrypt(inputData);
        byte[] decryptedData = bytesEncryptor.decrypt(encryptedData);

        System.out.println("Input data: " + new String(inputData));
        System.out.println("Encrypted data: " + new String(encryptedData));
        System.out.println("Decrypted data: " + new String(decryptedData));
    }
}