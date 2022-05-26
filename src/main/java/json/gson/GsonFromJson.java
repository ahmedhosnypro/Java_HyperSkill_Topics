package json.gson;


import com.google.gson.Gson;

public class GsonFromJson {

    public static void main(String[] args) {

        String json_string = "{\"firstName\":\"Tom\", \"lastName\": \"Broody\"}";
        String jsonMetroLinese = """
                {
                    "m1": {
                        "1": "Renes-Gare",
                        "2": "Epenex",
                        "3": "Crochy",
                        "4": "Cerisaie",
                        "5": "Bassenges",
                        "6": "EPFL",
                        "7": "UNL-Sorge",
                        "8": "Mouline",
                        "9": "UNL-Chemberonne",
                        "10": "Bourdonnette",
                        "11": "Melley",
                        "12": "Provence",
                        "13": "Montelly",
                        "14": "Vigie",
                        "15": "Lausanne-Flon"
                    },
                    "m2":{
                        "1":"Croisettes",
                        "2":"Vennes",
                        "3": "Fourmi",
                        "4": "Sallaz",
                        "5":"CHUV",
                        "6":"Ours",
                        "7":"Riponne M.Bejart",
                        "8":"Bessieres",
                        "9":"Lausanne-Flon",
                        "10":"Lausanne Gare CFF",
                        "11":"Grancy",
                        "12": "Delices",
                        "13":"Jourdils",
                        "14": "Ouchy-Olympique"
                    }
                }""";

        Gson gson = new Gson();
        User user = gson.fromJson(jsonMetroLinese, User.class);

        System.out.println(user);
    }
}
