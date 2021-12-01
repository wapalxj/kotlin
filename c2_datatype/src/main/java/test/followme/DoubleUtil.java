package test.followme;


import io.reactivex.rxjava3.annotations.NonNull;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by hou on 2015/8/14.
 */
public class DoubleUtil {

    static  String name;
    public static void main(String[] args) {
//        System.out.println(Integer.parseInt("1011".split("\\.")[0]));
        System.out.println((int)(Double.parseDouble("1.11")));
    }
    public static double parseDouble(String parserDouble) {
        try {
            return Double.parseDouble(parserDouble);
        } catch (Exception e) {
            return 0;
        }
    }

    public static String formatPrice(double price) {
        return formatPattern(",##0.00").format(price);
    }


    /**
     * 超过一定位数截取有坑，会四舍五入
     *
     * @param d
     * @param decimal
     * @return
     */
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




    @NonNull
    public static String format2DecimalAndSetComma(Double value) {
        if (value == null) {
            return "0.00";
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(value));
        return formatPattern(",##0.00").format(bigDecimal.setScale(2, BigDecimal.ROUND_DOWN));
    }

    @NonNull
    public static String format3DecimalAndSetComma(Double value) {
        if (value == null) {
            return "0.000";
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(value));
        return formatPattern(",##0.000").format(bigDecimal.setScale(3, BigDecimal.ROUND_DOWN));
    }

    /**
     * 格式化数字保留num位小数，并同时移除无用的多余0
     *
     * @param value
     * @param num
     * @return
     */
    @NonNull
    public static String formatDecimalAndSetCommaRemoveUnUseZero(Double value, int num) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(value));
        StringBuilder pattern = new StringBuilder(",##0.");
        for (int i = 0; i < num; i++) {
            pattern.append("0");
        }
        String result = formatPattern(pattern.toString()).format(bigDecimal.setScale(num, BigDecimal.ROUND_DOWN));
        //从后往前找到最后的无用0的位置下标
        int index = result.length();
        HH:
        for (int i = result.length() - 1; i >= 0; i--) {
            if (result.charAt(i) != 48) {
                //我跟你讲 这个位置不是0
                if (result.charAt(i) == 46) {
                    //我跟你讲 这个位置是.
                    index = i;
                    break HH;
                } else {
                    //这个地方是非0的数字哦
                    index = i + 1;
                    break HH;
                }
            }
        }
        return result.substring(0, index);
    }

    @NonNull
    public static String formatDecimal(Double d, int decimal) {
        BigDecimal bigDecimal = new BigDecimal(Double.toString(d));
        double value = bigDecimal.setScale(decimal, BigDecimal.ROUND_DOWN).doubleValue();
        return formatNormal(value, decimal);
    }

    @NonNull
    public static String format2Decimal(Double d) {
        return formatDecimal(d, 2);
    }

    @NonNull
    public static String doubleTrans(double d) {
        if (Math.round(d) - d == 0) {
            return String.valueOf((long) d);
        }
        return String.valueOf(d);
    }

    public static double roundDecimal(int newScale, double d) {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        double value = bd.setScale(newScale, BigDecimal.ROUND_HALF_UP).doubleValue();
        return Double.parseDouble(formatDecimal(value, newScale));
    }

    public static double round2Decimal(double d) {
        return roundDecimal(2, d);
    }




    public static DecimalFormat formatPattern(String pattern) {
        Locale enlocale = new Locale("en", "US");
        DecimalFormat decimalFormat = (DecimalFormat)
                NumberFormat.getNumberInstance(enlocale);
        decimalFormat.applyPattern(pattern);
        return decimalFormat;
    }

    public static DecimalFormat formatPattern() {
        Locale enlocale = new Locale("en", "US");
        DecimalFormat decimalFormat = (DecimalFormat)
                NumberFormat.getNumberInstance(enlocale);
        return decimalFormat;
    }

    @NonNull
    public static String formatSetComma(String value) {
        BigDecimal bigDecimal = new BigDecimal(value);
        return formatPattern(",##0").format(bigDecimal.setScale(2, BigDecimal.ROUND_DOWN));
    }


    public static String setCommaDouble(double d) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        return formatPattern(",##0.00").format(bigDecimal.setScale(2, BigDecimal.ROUND_DOWN));
    }
    public static String setCommaDouble(int i) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(i));
        return new DecimalFormat(",##0").format(bigDecimal);
    }

    public static String setCommaDouble(String d) {
        BigDecimal bigDecimal = new BigDecimal(d);
        return formatPattern(",##0.00").format(bigDecimal.setScale(2, BigDecimal.ROUND_DOWN));
    }




    public static double round4Decimal(double d) {
        return roundDecimal(4, d);
    }




    public static double getPointsizeByDigits(int digits) {
        if (digits < 1) return 1;
//        return Math.pow(10, -digits + 1);
        return Math.pow(0.1, digits);
    }

    public static String getThousandString(long number) {
        return getThousandString(number, false);
    }

    public static String getThousandString(long number, boolean upperCase) {
        if (number >= 1000) {
            if (number / 100 % 10 == 0) {
                return (int) (number / 1000) + (upperCase ? "K" : "k");
            } else {
                return formatDecimal((number / 1000d), 1) + (upperCase ? "K" : "k");
            }
        } else {
            return number + "";
        }
    }


    /**
     * 乘法并截取两位小数()
     *
     * @param a
     * @param b
     * @return
     */
    @NonNull
    public static String multiplyDecimal(Double a, Double b) {
        BigDecimal decimal = new BigDecimal(Double.toString(a)).multiply(new BigDecimal(Double.toString(b)));
        return formatPattern("##0.00").format(decimal.setScale(2, BigDecimal.ROUND_DOWN));
    }


    /**
     * Compare the size of two floating point numbers
     *
     * @param a
     * @param b
     * @return 1 is a > b
     * -1 is a < b
     * 0 is a == b
     */
    public static int compareFloat(float a, float b) {
        int ta = Math.round(a * 100000);
        int tb = Math.round(b * 100000);
        if (ta > tb) {
            return 1;
        } else if (ta < tb) {
            return -1;
        } else {
            return 0;
        }
    }

}
