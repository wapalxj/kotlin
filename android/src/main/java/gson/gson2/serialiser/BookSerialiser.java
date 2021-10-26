package gson.gson2.serialiser;

import com.google.gson.*;
import gson.gson2.bean.Book;

import java.lang.reflect.Type;

/**
 * 序列化时候，对特殊字段的映射
 */
public class BookSerialiser implements JsonSerializer<Book> {

    @Override
    public JsonElement serialize(final Book book, final Type typeOfSrc, final JsonSerializationContext context) {

        final JsonObject jsonObject = new JsonObject();
        //映射序列化的Key
        jsonObject.addProperty("title", book.getTitle());
        jsonObject.addProperty("isbn-10", book.getIsbn10());
        jsonObject.addProperty("isbn-13", book.getIsbn13());

        final JsonArray jsonAuthorsArray = new JsonArray();
        for (final String author : book.getAuthors()) {
            final JsonPrimitive jsonAuthor = new JsonPrimitive(author);
            jsonAuthorsArray.add(jsonAuthor);
        }
        jsonObject.add("authors", jsonAuthorsArray);

        return jsonObject;
    }
}