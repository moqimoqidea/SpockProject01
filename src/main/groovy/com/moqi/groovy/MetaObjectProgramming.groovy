package com.moqi.groovy

/**
 * Groovy 元对象编程
 * https://www.w3cschool.cn/groovy/groovy_meta_object_programming.html
 *
 * @author wenbo17* On 8/25/19 17:05
 */
class MetaObjectProgramming {

    static void main(String[] args) {
        Person person = new Person()
        person.Name = "zhangsan"
        person.ID = 1

        println(person.Name)
        println(person.ID)
        person.callNotExistMethod()




        MetaStudent metaStudent = new MetaStudent()
        println(metaStudent.getName())
        metaStudent.metaClass.setAttribute(metaStudent, 'name', 'lisi')
        println(metaStudent.getName())
    }

}

/**
 * 元对象编程或MOP可以用于动态调用方法，并且可以即时创建类和方法。
 */
class Person implements GroovyInterceptable {
    /**
     * 缺失属性
     * 所以，让我们看一个例子，我们如何为缺失的属性实现元对象编程。以下键应该注意以下代码。
     *
     * 类Student没有定义名为Name或ID的成员变量。
     *
     * 类Student实现GroovyInterceptable接口。
     *
     * 有一个称为dynamicProps的参数，将用于保存即时创建的成员变量的值。
     *
     * 方法getproperty和setproperty已被实现以在运行时获取和设置类的属性的值。
     */
    protected dynamicProps=[:]

    void setProperty(String pName, val) {
        dynamicProps[pName] = val
    }

    def getProperty(String pName) {
        dynamicProps[pName]
    }

    /**
     * 缺失方法
     * 所以，让我们看一个例子，我们如何为缺失的属性实现元对象编程。以下键应该注意下面的代码
     */
    /*def invokeMethod(String name, Object args) {
        return "called invokeMethod $name $args"
    }*/

    /**
     * 方法缺失
     * Groovy支持methodMissing的概念。
     * 此方法与invokeMethod的不同之处在于，它仅在失败的方法分派的情况下被调用，
     * 当没有找到给定名称和/或给定参数的方法时。以下示例显示如何使用methodMissing。
     */
    def methodMissing(String name, def args) {
      println "Missing method"
   }
}

/**
 * 元类
 * 此功能与MetaClass实现相关。在默认实现中，您可以访问字段而不调用它们的getter和setter。
 * 以下示例显示如何通过使用metaClass函数，我们能够更改类中的私有变量的值。
 */
class MetaStudent {
    private String name = 'zhansgan'

    public String getName() {
        return this.name
    }
}