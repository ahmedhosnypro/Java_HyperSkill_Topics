package json.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import java.io.IOException;
import java.io.StringReader;

public class GsonStreamApiRead {
    public static void main(String[] args) throws IOException {

        String json_string = "{\"name\":\"chair\",\"quantity\":3}";

        try (JsonReader jsonReader = new JsonReader(new StringReader(json_string))) {

            while (jsonReader.hasNext()) {

                JsonToken nextToken = jsonReader.peek();

                if (JsonToken.BEGIN_OBJECT.equals(nextToken)) {

                    jsonReader.beginObject();

                } else if (JsonToken.NAME.equals(nextToken)) {

                    jsonReader.nextName();

                } else if (JsonToken.STRING.equals(nextToken)) {

                    String value = jsonReader.nextString();
                    System.out.format("%s: ", value);

                } else if (JsonToken.NUMBER.equals(nextToken)) {

                    long value = jsonReader.nextLong();
                    System.out.println(value);

                }
            }
        }
    }
}
