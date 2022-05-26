package json.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GsonDataBindingApiRead {
    public static void main(String[] args) throws IOException {

        String fileName = "src/main/java/json/gson/cars.json";
        Path path = Paths.get(fileName);

        try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {

            Gson gson = new Gson();
            List<Car> cars = gson.fromJson(reader,
                    new TypeToken<List<Car>>() {
                    }.getType());

            cars.forEach(System.out::println);
        }
    }
}