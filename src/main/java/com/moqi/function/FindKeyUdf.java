package com.moqi.function;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.moqi.constant.Constant.*;
import static com.moqi.tool.Tool.checkStringIllegal;

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
     * 正则匹配式后缀（到竖线结束或者到字符串结尾结束）
     */
    private static final String REGEX_SUFFIX = "(.*?\\||.*?$)";

    public static String evaluate(String string, String key) {

        if (checkStringIllegal(string) || checkStringIllegal(key)) {
            return EMPTY_STRING;
        }

        // key 加冒号
        String keyWithColon = key + COLON;
        Matcher matcher = Pattern.compile(keyWithColon + REGEX_SUFFIX).matcher(string);

        if (matcher.find()) {
            // 匹配值去掉多余部分
            return matcher.group().replace(keyWithColon, EMPTY_STRING).replace(VERTICAL_BAR, EMPTY_STRING);
        }

        return EMPTY_STRING;
    }

}