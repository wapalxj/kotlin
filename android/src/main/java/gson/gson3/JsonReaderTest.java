package gson.gson3;

import com.google.gson.stream.JsonReader;
import disklru.bean.User;

import java.io.IOException;
import java.io.StringReader;

public class JsonReaderTest {
    public static void main(String[] args) throws IOException {
               String json = "{\"name\":\"vero\",\"age\":\"24\"}";
        User user=new User();
        JsonReader jsonReader=new JsonReader(new StringReader(json));

        jsonReader.beginObject();
        while (jsonReader.hasNext()){
            String name=jsonReader.nextName();
            switch (name){
                case "name":
                    user.name= jsonReader.nextString();
                    break;
                case "age":
                    user.age=jsonReader.nextInt();
                    break;
                default:
                    break;
            }
        }
        jsonReader.endObject();

        System.out.println(user);

    }
}
