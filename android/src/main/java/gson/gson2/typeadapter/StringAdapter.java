package gson.gson2.typeadapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class StringAdapter extends TypeAdapter<String> {

    public String read(JsonReader reader) throws IOException {
        if (reader.peek() == JsonToken.NULL) {
            reader.nextNull();
            //为null,则返回"vvvvvvvvvvvvv"
            return "vvvvvvvvvvvvv";
        }
        return reader.nextString();
    }

    public void write(JsonWriter writer, String value) throws IOException {
        if (value == null) {
            // 在这里处理null改为空字符串
            writer.value("vvvvvvvvvvvvv");
            return;
        }
        writer.value(value);
    }
}
