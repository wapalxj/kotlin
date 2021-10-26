package gson.gson2.serialiser;

import com.google.gson.*;
import gson.gson2.bean.Book;

import java.lang.reflect.Type;

/**
 * 反列化时候，对特殊字段的处理
 */
public class BookDeserializer implements JsonDeserializer<Book> {

    @Override
    public Book deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
            throws JsonParseException {
        System.out.println("---");
        final JsonObject jsonObject = json.getAsJsonObject();

        final JsonElement jsonTitle = jsonObject.get("title");
        final String title = jsonTitle.getAsString();

        final String isbn10 = jsonObject.get("isbn-10").getAsString();
        final String isbn13 = jsonObject.get("isbn-13").getAsString();

        final JsonArray jsonAuthorsArray = jsonObject.get("authors").getAsJsonArray();
        final String[] authors = new String[jsonAuthorsArray.size()];
        for (int i = 0; i < authors.length; i++) {
            final JsonElement jsonAuthor = jsonAuthorsArray.get(i);
            authors[i] = jsonAuthor.getAsString();
        }

        final Book book = new Book();
        book.setTitle(title);
        book.setIsbn10(isbn10);
        book.setIsbn13(isbn13);
        book.setAuthors(authors);
        return book;
    }
}