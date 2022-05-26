package json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

public class GsonExcludeFields {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .setPrettyPrinting()
                .create();

        Person person = new Person("Jack", "Sparrow", MaritalStatus.UNKNOWN);

        gson.toJson(person, System.out);
    }
}
