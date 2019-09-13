package com.moqi.groovy

/**
 * https://www.w3cschool.cn/groovy/groovy_unit_testing.html
 * @author moqi* On 8/25/19 16:47
 */
class UnitTestExample {
    static void main(String[] args) {
        UnitTestStudent mst = new UnitTestStudent();
        mst.name = "Joe";
        mst.ID = 1;
        println(mst.Display())
    }
}

class UnitTestStudent {
    String name;
    int ID;

    String Display() {
        return name + ID;
    }
}
