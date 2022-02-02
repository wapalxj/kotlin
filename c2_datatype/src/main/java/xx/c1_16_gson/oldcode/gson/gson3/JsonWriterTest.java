package xx.c1_16_gson.oldcode.gson.gson3;

import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.StringWriter;

public class JsonWriterTest {
    public static void main(String[] args) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);

        jsonWriter.beginObject();
        jsonWriter.name("name").value("vvvvvvvvvv");
        jsonWriter.name("age").value(1000);
        jsonWriter.endObject();
        System.out.println(stringWriter);

    }
}
