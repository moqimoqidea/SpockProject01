package com.moqi.groovy

import groovy.json.JsonSlurper

/**
 * https://www.w3cschool.cn/groovy/groovy_json.html
 *
 * @author moqi* On 8/25/19 16:26
 */
class Json {

    static void main(String[] args) {
        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{"name":"zhangsan", "age":18}')

        println(object.name)
        println(object.age)
    }

}
