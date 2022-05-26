package json.gson;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static json.gson.Car.createCars;

public class GsonTreeModelWrite {
    public static void main(String[] args) throws IOException {
        List<Car> cars = createCars();

        String fileName = "src/main/resources/cars.json";
        Path path = Paths.get(fileName);

        try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

            Gson gson = new Gson();

            JsonElement tree = gson.toJsonTree(cars);
            gson.toJson(tree, writer);
        }

        System.out.println("Cars written to file");
    }
}
