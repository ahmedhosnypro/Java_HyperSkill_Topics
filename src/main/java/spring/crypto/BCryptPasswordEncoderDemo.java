package spring.crypto;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BCryptPasswordEncoderDemo {
    public static void main(String[] args) {
        int strength = 7;
        PasswordEncoder bCryptEncoder = new BCryptPasswordEncoder(strength);

        String rawPassword = "hackme";
        String firstEncodedPassword = bCryptEncoder.encode(rawPassword);
        String secondEncodedPassword = bCryptEncoder.encode(rawPassword);

        System.out.println("First encoded password: " + firstEncodedPassword);
        System.out.println("Second encoded password: " + secondEncodedPassword);
    }
}
