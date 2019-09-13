package com.moqi.function

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author moqi* On 8/24/19 13:40
 */
@Unroll
class HelloSpockTest extends Specification {

    def "test getNameLength"() {
        expect:
        HelloSpock.getNameLength(name) == length

        where:
        name       | length
        "tom"      | 3
        "smith"    | 5
        "zhangsan" | 8
        "wangwu"   | 6
    }

}
