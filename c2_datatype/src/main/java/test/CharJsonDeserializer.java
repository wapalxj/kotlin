package test;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class CharJsonDeserializer implements JsonDeserializer<String> {
    @Override
    public String deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String str = jsonElement.getAsString();
        if (str.contains("&")) {
            return str.replaceAll("&", "666666666666");
        }
        return str;
    }
}
