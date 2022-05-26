package json.gson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class GsonBuilderEx {

    public static void main(String[] args) {

        try (PrintStream prs = new PrintStream(System.out, true,
                StandardCharsets.UTF_8)) {

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            User user = new User("Peter", "Flemming");
            gson.toJson(user, prs);
        }
    }
}
