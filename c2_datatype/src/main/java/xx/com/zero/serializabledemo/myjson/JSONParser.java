package xx.com.zero.serializabledemo.myjson;


import xx.com.zero.serializabledemo.myjson.parser.Parser;
import xx.com.zero.serializabledemo.myjson.tokenizer.CharReader;
import xx.com.zero.serializabledemo.myjson.tokenizer.TokenList;
import xx.com.zero.serializabledemo.myjson.tokenizer.Tokenizer;

import java.io.IOException;
import java.io.StringReader;


public class JSONParser {

    private Tokenizer tokenizer = new Tokenizer();//词法分析

    private Parser parser = new Parser();//语法解析

    public Object fromJSON(String json) throws IOException {
        CharReader charReader = new CharReader(new StringReader(json));
        TokenList tokens = tokenizer.tokenize(charReader);
        return parser.parse(tokens);
    }
}
