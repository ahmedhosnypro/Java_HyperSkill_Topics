package json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.Date;

public class demo {
    public static void main(String[] args) {
        Post post = new Post(
                1,
                new Date(),
                "I learned how to use jackson!",
                10,
                Arrays.asList("Well done!", "Great job!")
        );

        // Step 2
        ObjectMapper objectMapper = new ObjectMapper();

        // Step 3
        String postAsString;
        String prettyprinter;
        try {
            postAsString = objectMapper.writeValueAsString(post);
            prettyprinter = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(post);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        System.out.println(postAsString);
        System.out.println(prettyprinter);
    }
}
