package json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonSerializeNulls {

    public static void main(String[] args) {

        GsonBuilder builder = new GsonBuilder();

        builder.serializeNulls();

        Gson gson = builder.create();

        User user = new User();
        user.setFirstName("Norman");

        String json = gson.toJson(user);
        System.out.println(json);

    }
}