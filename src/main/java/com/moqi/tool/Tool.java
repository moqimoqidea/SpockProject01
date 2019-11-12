package com.moqi.tool;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

import static com.moqi.constant.Constant.NULL_STRING;


/**
 * 项目公用工具类
 *
 * @author moqi
 * On 2019-08-20 23:07
 */

public class Tool {

    /**
     * 校验字符串不合法性：判断输入字符串是否是空或者字符串 null
     *
     * @param string 输入字符串
     * @return 布尔值：不合法则返回 true，合法返回 false
     */
    public static boolean checkStringIllegal(String string) {
        return StringUtils.isBlank(string) || Objects.equals(NULL_STRING, string);
    }

}
