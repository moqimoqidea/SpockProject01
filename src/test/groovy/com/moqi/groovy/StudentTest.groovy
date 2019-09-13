package com.moqi.groovy

import junit.framework.Test
import junit.textui.TestRunner

/**
 * https://www.w3cschool.cn/groovy/groovy_unit_testing.html
 * @author moqi* On 8/25/19 16:51
 */
class StudentTest1 extends GroovyTestCase {

    void testDisplay() {
        def stud = new UnitTestStudent(name:'zhangsan', ID:1)
        def expected = 'zhangsan1'
        assertToString(stud.Display(), expected)
    }

}

class StudentTest2 extends GroovyTestCase {

    void testDisplay() {
        def stud = new UnitTestStudent(name:'lisi', ID:2)
        def expected = 'lisi2'
        assertToString(stud.Display(), expected)
    }

}

class AllTests {
    static Test suite() {
        def allTests = new GroovyTestSuite()
        allTests.addTestSuite(StudentTest1.class)
        allTests.addTestSuite(StudentTest2.class)
        return allTests
    }
}

TestRunner.run(AllTests.suite())