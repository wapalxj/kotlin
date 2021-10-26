package test;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CharAdapter extends TypeAdapter<String> {

    public static double roundDecimal(int newScale, double d) {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        double value = bd.setScale(newScale, BigDecimal.ROUND_HALF_UP).doubleValue();
        return Double.parseDouble(formatDecimal(value, newScale));
    }

    public static String formatDecimal(Double d, int decimal) {
        BigDecimal bigDecimal = new BigDecimal(Double.toString(d));
        double value = bigDecimal.setScale(decimal, BigDecimal.ROUND_DOWN).doubleValue();
        return formatNormal(value, decimal);
    }

    public static String formatNormal(double d, int decimal) {
        String formatDecimalString = "";
        switch (decimal) {
            case 0:
                formatDecimalString = "######0";
                break;
            case 1:
                formatDecimalString = "######0.0";
                break;
            case 3:
                formatDecimalString = "######0.000";
                break;
            case 4:
                formatDecimalString = "######0.0000";
                break;
            case 5:
                formatDecimalString = "######0.00000";
                break;
            case 6:
                formatDecimalString = "######0.000000";
                break;
            case 7:
                formatDecimalString = "######0.0000000";
                break;
            default:
                formatDecimalString = "######0.00";
                break;
        }
        return formatPattern(formatDecimalString).format(d);
    }

    public static DecimalFormat formatPattern(String pattern) {
        Locale enlocale = new Locale("en", "US");
        DecimalFormat decimalFormat = (DecimalFormat)
                NumberFormat.getNumberInstance(enlocale);
        decimalFormat.applyPattern(pattern);
        return decimalFormat;
    }

    public static void main(String[] args) {
        String str="sadsad";
        System.out.println(str.substring(0, 0));
    }

    @Override
    public void write(JsonWriter jsonWriter, String s) throws IOException {

    }

    @Override
    public String read(JsonReader reader) throws IOException {
//        reader.nextString();
        String str = "";
        if (reader.peek() == JsonToken.STRING && str.contains("AAAA")) {
            str = reader.nextString();
            str.replaceAll("AAAA", "1111");
            return "";
        }
        return str;
    }
}
