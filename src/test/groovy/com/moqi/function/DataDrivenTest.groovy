package com.moqi.function


import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author moqi* On 8/24/19 13:48
 */
@Unroll
class DataDrivenTest extends Specification {

    def "这两个数 #a 和 #b 中比较小的是 #c"() {
        expect:
        Math.min(a, b) == c

        where:
        a | b || c
        3 | 7 || 3
        5 | 4 || 4
        9 | 9 || 9
    }

    def "获取两个数中较大的值"() {
        expect:
        Math.max(a, b) == c

        where:
        a << [3, 5, 9]
        b << [7, 4, 9]
        c << [7, 5, 9]
    }

}
