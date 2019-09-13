package com.moqi.groovy

/**
 * 闭包是一个短的匿名代码块。它通常跨越几行代码。一个方法甚至可以将代码块作为参数。它们是匿名的。
 * https://www.w3cschool.cn/groovy/groovy_closures.html
 *
 * @author moqi* On 8/25/19 15:41
 */
class Closure {


    static void main(String[] args) {
        // defaultClosure()
        // closureWithParameter("Zhangsan")
        closureWithDefaultParameter("Lisi")
    }

    /**
     * 这个方法重复了前面的例子并产生相同的结果，但显示可以使用被称为它的隐式单个参数。
     * 这里的'it'是Groovy中的关键字。
     */
    private static void closureWithDefaultParameter(String param) {
        def closure = {println("Hello ${it}") }
        closure.call(param)
    }

    /**
     * 闭包也可以包含形式参数，以使它们更有用，就像Groovy中的方法一样。
     */
    private static void closureWithParameter(String param) {
        def closure = { innerParameter -> println("Hello ${innerParameter}") }
        closure.call(param)
    }

    private static void defaultClosure() {
        def closure = { println("Hello World") }
        closure.call()
    }


}
