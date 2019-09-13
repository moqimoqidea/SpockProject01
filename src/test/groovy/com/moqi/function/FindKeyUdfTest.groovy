package com.moqi.function

import com.moqi.constant.Constant
import spock.lang.Specification

/**
 * @author moqi* On 2019-08-19 23:10
 */
class FindKeyUdfTest extends Specification {

    def "normal data should return correct value"() {
        expect:
        FindKeyUdf.evaluate("name:zhangsan|age:18|gender:man", "age") == "18"
    }

    def "null data should return empty string"() {
        expect:
        FindKeyUdf.evaluate(Constant.NULL_STRING, "age") == Constant.EMPTY_STRING
    }

    def "empty string data should return empty string"() {
        expect:
        FindKeyUdf.evaluate(Constant.EMPTY_STRING, "age") == Constant.EMPTY_STRING
    }

}
