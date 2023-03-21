package json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialization {
    public static void main(String[] args) {
        String inputJson = "{\"id\":1,\"postedAt\":1654027200000,\"content\":\"I learned how to use jackson!\",\"likes\":10,\"comments\":[\"Well done!\",\"Great job!\"]}\n";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Post post = objectMapper.readValue(inputJson, Post.class);
            System.out.println(post.getContent());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
