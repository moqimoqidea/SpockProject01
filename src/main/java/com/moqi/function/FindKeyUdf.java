package com.moqi.function;


import static com.moqi.constant.Constant.*;

/**
 * 取出在指定字符串中指定 key 的的值，格式如下
 * <p>
 * 字符串：name:zhangsan|age:20|gender:man
 * key:name
 * 返回值：zhangsan
 * <p>
 * 其他取不到值的情况返回空字符串
 *
 * @author moqi
 * On 2019-08-19 14:18
 */
public class FindKeyUdf {

    /**
     * 数组最小长度
     */
    private static final int ARRAY_MIN_LENGTH = 2;

    public static String evaluate(String string, String key) {
        // key 加冒号
        String keyWithColon = key + COLON;

        if (string == null || EMPTY_STRING.equals(string) || !string.contains(keyWithColon)) {
            return EMPTY_STRING;
        }

        if (string.split(keyWithColon).length < ARRAY_MIN_LENGTH) {
            return EMPTY_STRING;
        }

        // key 的长度，提高匹配速度
        int keyLength = key.length();

        for (String subString : string.split(VERTICAL_BAR)) {
            String[] innerArray = subString.split(COLON);
            // 顺序根据匹配效率而定
            if (keyLength == innerArray[0].length() && ARRAY_MIN_LENGTH == innerArray.length && key.equals(innerArray[0])) {
                return innerArray[1];
            }

        }

        return EMPTY_STRING;
    }

}