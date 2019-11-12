package com.moqi.function

import com.moqi.constant.Constant
import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author moqi* On 2019-08-19 23:10
 */
@Unroll
class FindKeyUdfTest extends Specification {

    def "输入 string 为 #string 且 key 为 #key 时输出 #out"() {
        expect:
        FindKeyUdf.evaluate(string, key) == out

        where:
        string                            | key    | out
        "name:zhangsan|age:20|gender:man" | "name" | "zhangsan"
        Constant.EMPTY_STRING             | "name" | Constant.EMPTY_STRING
        Constant.NULL_STRING              | "name" | Constant.EMPTY_STRING
        "age:20|gender:man"               | "name" | Constant.EMPTY_STRING
        "name:|age:20|gender:man"         | "name" | Constant.EMPTY_STRING
        "age:20|gender:man|name:"         | "name" | Constant.EMPTY_STRING
    }

}
