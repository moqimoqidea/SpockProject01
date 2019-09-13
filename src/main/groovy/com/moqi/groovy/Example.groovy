package com.moqi.groovy

/**
 * @author moqi* On 8/25/19 14:43
 */
class Example {

    static void main(String[] args) {
        // DisplayName()
        // rangeTest()
        // println(sum(10, 5))
        println(sumWithDefaultParameter(10))
    }

    /**
     * Groovy中还有一个规定来指定方法中的参数的默认值。
     * 如果没有值传递给参数的方法，则使用缺省值。
     * 如果使用非默认和默认参数，则必须注意，默认参数应在参数列表的末尾定义。
     */
    static int sumWithDefaultParameter(int i, int j = 10) {
        i + j
    }

    /**
     * 一个带有2个参数a和b的sum方法
     */
    static int sum(int i, int j) {
        i + j
    }

    /**
     * DisplayName是一个简单的方法，它由两个println语句组成，用于向控制台输出一些文本。
     */
    static def DisplayName() {
        println("This is how methods work in groovy")
        println("This is an example of a simple method")
    }

    /**
     * Groovy支持范围的概念，并在..符号的帮助下提供范围运算符的符号。
     */
    static void rangeTest() {
        def range = 1..10
        println(range)
        println(range.get(5))
    }
}
