package gson.gson2.typeadapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import gson.gson2.bean.Book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookTypeAdapter extends TypeAdapter<Book> {


    /**
     * 反序列化
     *
     * @param in
     * @return
     * @throws IOException
     */
    @Override
    public Book read(final JsonReader in) throws IOException {
        final Book book = new Book();

        in.beginObject();
        while (in.hasNext()) {
            switch (in.nextName()) {
                case "isbn-10":
                    book.setIsbn10(in.nextString());
                    break;
                case "isbn-13":
                    book.setIsbn13(in.nextString());
                    break;
                case "title":
                    book.setTitle(in.nextString());
                    break;
                case "authors":
                    in.beginArray();
                    final List<String> authors = new ArrayList<>();
                    while (in.hasNext()) {
                        authors.add(in.nextString());
                    }
                    book.setAuthors(authors.toArray(new String[authors.size()]));
                    in.endArray();
                    break;
            }
        }
        in.endObject();

        return book;
    }

    /**
     * 序列化
     *
     * @return
     * @throws IOException
     */
    @Override
    public void write(final JsonWriter out, final Book book) throws IOException {
        out.beginObject();
        out.name("isbn-10").value(book.getIsbn10());
        out.name("isbn-13").value(book.getIsbn13());
        out.name("title").value(book.getTitle());
        out.name("authors").beginArray();
        for (final String author : book.getAuthors()) {
            out.value(author);
        }
        out.endArray();
        out.endObject();
    }
}