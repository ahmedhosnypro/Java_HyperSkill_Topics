package json.gson;

import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//        JsonToken types:
//        BEGIN_ARRAY — opening of a JSON array
//        END_ARRAY — closing of a JSON array
//        BEGIN_OBJECT — opening of JSON object
//        END_OBJECT — closing of JSON object
//        NAME — a JSON property name
//        STRING — a JSON string
//        NUMBER — a JSON number (double, long, or int)
//        BOOLEAN — a JSON boolean value
//        NULL — a JSON null
//        END_DOCUMENT — ehe end of the JSON stream.
public class GsonStreamApiWrite {
    public static void main(String[] args) throws IOException {

        String fileName = "src/main/java/json/gson/cars.json";
        Path path = Paths.get(fileName);

        try (JsonWriter writer = new JsonWriter(Files.newBufferedWriter(path,
                StandardCharsets.UTF_8))) {

            writer.beginObject();
            writer.name("name").value("Audi");
            writer.name("model").value("2012");
            writer.name("price").value(22000);

            writer.name("colours");
            writer.beginArray();
            writer.value("gray");
            writer.value("red");
            writer.value("white");
            writer.endArray();

            writer.endObject();
        }

        System.out.println("Data written to file");
    }
}
